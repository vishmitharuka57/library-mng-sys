package lk.ijse.CityLibrary.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import lk.ijse.CityLibrary.db.DBConnection;
import lk.ijse.CityLibrary.model.DonationModel;
import lk.ijse.CityLibrary.to.Donation;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DonationsManagerPageController {
    public TableView<Donation> tblDonation;
    public TableColumn colDonationId;
    public TableColumn colDonorName;
    public TableColumn colDonorAddress;
    public TableColumn colDonorNic;
    public TableColumn colBookName;
    public TableColumn colBookId;
    public TableColumn colBookCategory;
    public TextField txtDonorName;
    public TextField txtBookName;
    public TextField txtBookId;
    public TextField txtDonationId;
    public TextField txtAddress;
    public TextField txtBookCategory;
    public TextField txtDonorNic;

    public void initialize()  {

        colDonationId.setCellValueFactory(new PropertyValueFactory<>("donationId"));
        colDonorName.setCellValueFactory(new PropertyValueFactory<>("donorName"));
        colDonorAddress.setCellValueFactory(new PropertyValueFactory<>("donorAddress"));
        colDonorNic.setCellValueFactory(new PropertyValueFactory<>("donorNic"));
        colBookName.setCellValueFactory(new PropertyValueFactory<>("bookName"));
        colBookId.setCellValueFactory(new PropertyValueFactory<>("bookId"));
        colBookCategory.setCellValueFactory(new PropertyValueFactory<>("categoryName"));


        try {
            loadAllMembers();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    private void loadAllMembers() throws SQLException, ClassNotFoundException {
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM DONATION ");
        ResultSet rst = stm.executeQuery();
        ArrayList<Donation> donations = new ArrayList<>();
        while (rst.next()){
            donations.add(new Donation(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getString(7)
            ));


        }
        setDonationsToTable(donations);
    }

    private void setDonationsToTable(ArrayList<Donation> donations) {
        ObservableList<Donation> obList = FXCollections.observableArrayList();
        donations.forEach(e ->{
            obList.add(new Donation(e.getDonationId(), e.getDonorName(), e.getDonorAddress(), e.getDonorNic(),e.getBookName(),e.getBookId(),e.getCategoryName()));

        });
        tblDonation.setItems(obList);
    }

    public void btnUpdateBookOnAction(ActionEvent actionEvent) {
    }

    public void btnSaveBookOnAction(ActionEvent actionEvent) {
        String donationId = txtDonationId.getText();
        String donorName = txtDonorName.getText();
        String donorAddress = txtAddress.getText();
        String donorNic = txtDonorNic.getText();
        String  bookName = txtBookName.getText();
        String bookId = txtBookId.getText();
        String categoryName = txtBookCategory.getText();


        Donation donation = new Donation(donationId, donorName, donorAddress, donorNic, bookName, bookId,categoryName);
        try {
            boolean isAdded = DonationModel.save(donation);

            if (isAdded) {
                new Alert(Alert.AlertType.CONFIRMATION, "Customer Added!").show();
            } else {
                new Alert(Alert.AlertType.WARNING, "Something happened!").show();
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
