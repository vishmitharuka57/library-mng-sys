package lk.ijse.CityLibrary.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class SalaryManagerPageController {
    public TextField txtName;
    public TextField txtNoOfAttenance;
    public TextField txtAmountPerDay;
    public TextField txtId;
    public TextField txtDepartment;
    public TextField txtRole;
    public TextField txtMonthlySalary;
    public TableView tblEmpSalary;
    public TableColumn colEmpId;
    public TableColumn colEmpName;
    public TableColumn colDepartment;
    public TableColumn colAttendCount;
    public TableColumn colRole;
    public TableColumn colAmountPerDay;
    public TableColumn colSalary;
    public TableColumn colDistributedOrNot;

    public void btnUpdateOnAction(ActionEvent actionEvent) {
    }

    public void btnSaveOnAction(ActionEvent actionEvent) {
    }
}
