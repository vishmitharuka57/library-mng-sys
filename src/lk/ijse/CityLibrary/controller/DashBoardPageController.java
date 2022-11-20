package lk.ijse.CityLibrary.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.AnchorPane;
import lk.ijse.CityLibrary.util.Navigation;
import lk.ijse.CityLibrary.util.Routes;

import java.awt.*;
import java.io.IOException;

public class DashBoardPageController {
    @FXML
    private AnchorPane pane;

    @FXML
    private Label txtAvailableBooks;

    @FXML
    private Label txtTotalMembers;

    @FXML
    private Label txtBorrowedBooks;

    @FXML
    private Label txtTotalDonors;

    @FXML
    private TableColumn<?, ?> colBookId;

    @FXML
    private TableColumn<?, ?> colMemberId;

    @FXML
    private TableColumn<?, ?> colBorrowId;

    @FXML
    private TableColumn<?, ?> colStatus;

    @FXML
    private TableColumn<?, ?> colBorrowDate;

    @FXML
    private TableColumn<?, ?> colReturnDate;

    @FXML
    private TableColumn<?, ?> colFineId;

    @FXML
    private AnchorPane adminpane;

    @FXML
    void CategoryManagerOnAction(ActionEvent event) throws IOException {
        Navigation.navigate(Routes.CATEGORY, pane);

    }

    @FXML
    void SalaryManagerOnAction(ActionEvent event) throws IOException {
        Navigation.navigate(Routes.SALARY, pane);

    }

    @FXML
    void adminOnAction(ActionEvent event) throws IOException {
        Navigation.navigate(Routes.ADMINPANEL, adminpane);
        adminpane.setVisible(!adminpane.isVisible());
    }

    @FXML
    void booksManagerOnAction(ActionEvent event) throws IOException {
        Navigation.navigate(Routes.BOOK, pane);


    }

    @FXML
    void borrowingDetailOnAction(ActionEvent event) throws IOException {
        Navigation.navigate(Routes.BORROWINGDETAIL, pane);

    }

    @FXML
    void dashboardOnAction(ActionEvent event) throws IOException {
        Navigation.navigate(Routes.DASHBOARDFORM, pane);

    }

    @FXML
    void donationManagerOnAction(ActionEvent event) throws IOException {
        Navigation.navigate(Routes.DONATION, pane);

    }

    @FXML
    void employeeManagerOnAction(ActionEvent event) throws IOException {
        Navigation.navigate(Routes.EMPLOYEE, pane);

    }

    @FXML
    void expenditureManagerOnAction(ActionEvent event) throws IOException {
        Navigation.navigate(Routes.EXPENDITURE, pane);

    }

    @FXML
    void finesManagerOnAction(ActionEvent event) throws IOException {
        Navigation.navigate(Routes.FINE, pane);

    }

    @FXML
    void memberManagerOnAction(ActionEvent event) throws IOException {
        Navigation.navigate(Routes.MEMBER, pane);

    }

    @FXML
    void userManagerOnAction(ActionEvent event) throws IOException {
        Navigation.navigate(Routes.USER, pane);

    }
}
