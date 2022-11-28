package lk.ijse.CityLibrary.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import lk.ijse.CityLibrary.db.DBConnection;
import lk.ijse.CityLibrary.model.EmployeeModel;
import lk.ijse.CityLibrary.to.Employee;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeManagerPageController {
    public AnchorPane pane;
    public TableColumn colEmpId;
    public TableColumn colEmpName;
    public TableColumn colDepartment;
    public TableColumn colDob;
    public TableColumn colNic;
    public TableColumn colAddress;
    public TableColumn colDescription;
    public TextField txtEmpName;
    public TextField txtDob;
    public TextField txtAddress;
    public TextField txtEmpId;
    public TextField txtDepartment;
    public TextField txtNic;
    public TextField txtDescription;
    public TableView<Employee> tblEmployee;

    public void initialize()  {

        colEmpId.setCellValueFactory(new PropertyValueFactory<>("empId"));
        colEmpName.setCellValueFactory(new PropertyValueFactory<>("empName"));
        colDepartment.setCellValueFactory(new PropertyValueFactory<>("department"));
        colDob.setCellValueFactory(new PropertyValueFactory<>("dob"));
        colNic.setCellValueFactory(new PropertyValueFactory<>("nic"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colDescription.setCellValueFactory(new PropertyValueFactory<>("description"));

        try {
            loadAllMembers();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    private void loadAllMembers() throws SQLException, ClassNotFoundException {
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM EMPLOYEE ");
        ResultSet rst = stm.executeQuery();
        ArrayList<Employee> employees = new ArrayList<>();
        while (rst.next()){
            employees.add(new Employee(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getString(7)
            ));


        }
        setEmployeesToTable(employees);
    }

    private void setEmployeesToTable(ArrayList<Employee> employees) {
        ObservableList<Employee> obList = FXCollections.observableArrayList();
        employees.forEach(e ->{
            obList.add(new Employee(e.getEmpId(), e.getEmpName(), e.getDepartment(),
                    e.getDob(),e.getNic(),e.getAddress(),e.getDescription()));

        });
        tblEmployee.setItems(obList);
    }


    public void attendanceDetailsOnAction(ActionEvent actionEvent) {
    }

    public void btnUpdateOnAction(ActionEvent actionEvent) {
    }

    public void btnSaveOnAction(ActionEvent actionEvent) {
        String empId = txtEmpId.getText();
        String empName = txtEmpName.getText();
        String department = txtDepartment.getText();
        String dob = txtDob.getText();
        String nic = txtNic.getText();
        String address = txtAddress.getText();
        String description = txtDescription.getText();



        Employee employee = new Employee(empId,empName,department,dob,nic,address,description);
        try {
            boolean isAdded = EmployeeModel.save(employee);

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
