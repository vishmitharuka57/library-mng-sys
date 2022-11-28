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
import lk.ijse.CityLibrary.model.ExpenditureModel;
import lk.ijse.CityLibrary.to.Expenditure;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ExpenditureManagerPageController {
    public TableView<Expenditure> tblExpenditure;
    public TableColumn colExpendId;
    public TableColumn colDescription;
    public TableColumn colAmount;
    public TableColumn colDate;
    public TableColumn colInvoiceNo;
    public TableColumn colPaidOrNot;
    public TextField txtExpenditureDescription;
    public TextField txtDate;
    public TextField txtExpenditureId;
    public TextField txtAmount;
    public TextField txtInvoiceNo;

    public void initialize()  {

        colExpendId.setCellValueFactory(new PropertyValueFactory<>("expenditureId"));
        colDescription.setCellValueFactory(new PropertyValueFactory<>("description"));
        colAmount.setCellValueFactory(new PropertyValueFactory<>("amount"));
        colDate.setCellValueFactory(new PropertyValueFactory<>("date"));
        colInvoiceNo.setCellValueFactory(new PropertyValueFactory<>("invoiceNo"));


        try {
            loadAllMembers();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    private void loadAllMembers() throws SQLException, ClassNotFoundException {
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM EXPENDITURE ");
        ResultSet rst = stm.executeQuery();
        ArrayList<Expenditure> expenditures = new ArrayList<>();
        while (rst.next()){
            expenditures.add(new Expenditure(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getDouble(3),
                    rst.getString(4),
                    rst.getString(5)
            ));


        }
        setExpendituresToTable(expenditures);
    }

    private void setExpendituresToTable(ArrayList<Expenditure> expenditures) {
        ObservableList<Expenditure> obList = FXCollections.observableArrayList();
        expenditures.forEach(e ->{
            obList.add(new Expenditure(e.getExpenditureId(), e.getDescription(), e.getAmount(), e.getDate(),e.getInvoiceNo()));

        });
        tblExpenditure.setItems(obList);
    }

    public void btnUpdateOnAction(ActionEvent actionEvent) {
    }

    public void btnSaveOnAction(ActionEvent actionEvent) {
        String expenditureId = txtExpenditureId.getText();
        String description = txtExpenditureDescription.getText();
        double amount = Double.parseDouble(txtAmount.getText());
        String date = txtDate.getText();
        String invoiceNo = txtInvoiceNo.getText();


        Expenditure expenditure = new Expenditure(expenditureId, description, amount, date, invoiceNo);
        try {
            boolean isAdded = ExpenditureModel.save(expenditure);

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
