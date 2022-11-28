package lk.ijse.CityLibrary.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import lk.ijse.CityLibrary.model.UserModel;
import lk.ijse.CityLibrary.to.User;
import lk.ijse.CityLibrary.util.Navigation;
import lk.ijse.CityLibrary.util.Routes;

import java.io.IOException;
import java.sql.SQLException;

public class RegisterAccountFormController {

    @FXML
    private AnchorPane pane;
    @FXML
    private AnchorPane pane2;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtUserName;

    @FXML
    private TextField txtPassword;

    @FXML
    private TextField txtRole;


    @FXML
    private TextField txtUserId;

    @FXML
    private TextField txtNic;

    @FXML
    private TextField txtTelephone;

    @FXML
    private TextField txtAddress;

    @FXML
    void loginPageOnAction(ActionEvent event) throws IOException {
        Navigation.navigate(Routes.LOGOUT, pane2);
    }


    public void createAndSaveAccount(ActionEvent actionEvent) throws IOException, RuntimeException {
         String name = txtName.getText();
         String userId = txtUserId.getText();
         String userName = txtUserName.getText();
         String role = txtRole.getText();
         String nic = txtNic.getText();
         String address = txtAddress.getText();
         String telephone = txtTelephone.getText();
         String password = txtPassword.getText();



        User user = new User(name , userName , userId , nic , address , role , telephone ,password );
        try {
            boolean isAdded = UserModel.save(user);

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
