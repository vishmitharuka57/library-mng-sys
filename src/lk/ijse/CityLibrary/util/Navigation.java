package lk.ijse.CityLibrary.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Navigation {
    private static AnchorPane pane;
    private static AnchorPane pane1;

    public static void navigate(Routes route, AnchorPane pane) throws IOException {
        Navigation.pane = pane;
        Navigation.pane.getChildren().clear();
        Stage window = (Stage) Navigation.pane.getScene().getWindow();

        switch (route) {
            case DASHBOARDPAGE:
                window.setTitle("Dashboard Page");
                initUI("DashBoardPage.fxml");
                break;

            case DASHBOARDFORM:
               initUI("DashBoardForm.fxml");
                break;

            case REGISTER:
               initUI("RegisterAccountForm.fxml");
                break;
            case USER:
                window.setTitle("User Management Page");
                initUI("UserPage.fxml");
                break;
            case MEMBER:
                window.setTitle("Member Management Page");
                initUI("MemberPage.fxml");
                break;
            case BORROWINGDETAIL:
                window.setTitle("Borrowing Detail Page");
                initUI("BorrowingDetailsPage.fxml");
                break;
            case LOGOUT:
                window.setTitle("Login Page");
                initUI("LoginPage.fxml");
                break;

            case ADMINPANEL:
                initUI("adminDash.fxml");
                break;

            case SALARY:
                window.setTitle("Employee Salary Management Page");
                initUI("SalaryManagerPage.fxml");
                break;

            case FOGOTPASSWORD:
                initUI("FogotPasswordPage.fxml");
                break;

            case FINE:
                window.setTitle("Fine Management Page");
                initUI("FinesManagerPage.fxml");
                break;

            case EXPENDITURE:
                window.setTitle("Expenditure Management Page");
                initUI("ExpenditureManagerPage.fxml");
                break;

            case EMPLOYEE:
                window.setTitle("Employee Management Page");
                initUI("EmployeeManagerPage.fxml");
                break;

            case DONATION:
                window.setTitle("Donation Management Page");
                initUI("DonationsManagerPage.fxml");
                break;

            case CATEGORY:
                window.setTitle("Category Management Page");
                initUI("CategoryManagePage.fxml");
                break;

            case BOOK:
                window.setTitle("Books Management Page");
                initUI("BooksManagerPage.fxml");
                break;

            case ATTENDANCE:
                window.setTitle("Attendance Management Page");
                initUI("AttendenceManagePage.fxml");
                break;

            default:
                new Alert(Alert.AlertType.ERROR, "Not suitable UI found!").show();
        }
    }
    private static void initUI(String location) throws IOException {
        Navigation.pane.getChildren().add(FXMLLoader.load(Navigation.class.getResource("/lk/ijse/CityLibrary/view/" + location)));
    }



}
