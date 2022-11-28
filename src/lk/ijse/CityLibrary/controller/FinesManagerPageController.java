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
import lk.ijse.CityLibrary.model.FineModel;
import lk.ijse.CityLibrary.to.Fine;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FinesManagerPageController {
    public TableView<Fine>tblFine;
    public TableColumn colFineId;
    public TableColumn colMemberId;
    public TableColumn colBookId;
    public TableColumn ColBorrowedDate;
    public TableColumn colReturnedDate;
    public TableColumn colLateDatesCount;
    public TableColumn colTotalFine;
    public TableColumn colPaidOrNot;
    public TextField txtBookId;
    public TextField txtNoOfLateDates;
    public TextField txtReturnDate;
    public TextField txtMemberId;
    public TextField txtBorrowedDate;
    public TextField txtTotalFine;
    public TextField txtFineId;
    public TextField txtPaidOrNot;
    public void initialize()  {

        colFineId.setCellValueFactory(new PropertyValueFactory<>("fineId"));
        colMemberId.setCellValueFactory(new PropertyValueFactory<>("memberId"));
        colBookId.setCellValueFactory(new PropertyValueFactory<>("bookId"));
        ColBorrowedDate.setCellValueFactory(new PropertyValueFactory<>("borrowedDate"));
        colReturnedDate.setCellValueFactory(new PropertyValueFactory<>("returnedDate"));
        colLateDatesCount.setCellValueFactory(new PropertyValueFactory<>("NoOfDays"));
        colTotalFine.setCellValueFactory(new PropertyValueFactory<>("amount"));
        colPaidOrNot.setCellValueFactory(new PropertyValueFactory<>("paidOrNot"));


        try {
            loadAllFines();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    private void loadAllFines() throws SQLException, ClassNotFoundException {
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM FINE ");
        ResultSet rst = stm.executeQuery();
        ArrayList<Fine> fines = new ArrayList<>();
        while (rst.next()){
            fines.add(new Fine(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getString(7),
                    rst.getString(8)
            ));


        }
        setFinesToTable(fines);
    }

    private void setFinesToTable(ArrayList<Fine> fines) {
        ObservableList<Fine> obList = FXCollections.observableArrayList();
        fines.forEach(e ->{
            obList.add(new Fine(e.getFineId(), e.getMemberId(), e.getBookId(), e.getBorrowedDate(),e.getReturnedDate(),e.getNoOfDays(),e.getAmount(),e.isPaidOrNot()));

        });
        tblFine.setItems(obList);
    }


    public void btnSaveOnAction(ActionEvent actionEvent) {
        String fineId  = txtFineId.getText();
        String memberId  = txtMemberId.getText();
        String bookId  = txtBookId.getText();
        String borrowedDate  = txtBorrowedDate.getText();
        String returnedDate  = txtReturnDate.getText();
        int NoOfDays  = Integer.parseInt(txtNoOfLateDates.getText());
        double amount   = Double.parseDouble(txtTotalFine.getText());
        boolean paidOrNot   = Boolean.parseBoolean(txtPaidOrNot.getText());


        Fine fine = new Fine(fineId, memberId , bookId , borrowedDate , returnedDate , NoOfDays, amount ,paidOrNot  );
        try {
            boolean isAdded = FineModel.save(fine);

            if (isAdded) {
                new Alert(Alert.AlertType.CONFIRMATION, "Customer Added!").show();
            } else {
                new Alert(Alert.AlertType.WARNING, "Something happened!").show();
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void btnUpdateOnAction(ActionEvent actionEvent) {
    }
}
