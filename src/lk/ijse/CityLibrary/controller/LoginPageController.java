package lk.ijse.CityLibrary.controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;
import lk.ijse.CityLibrary.util.Navigation;
import lk.ijse.CityLibrary.util.Routes;

import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.regex.Pattern;

public class LoginPageController {
    public Label lblUserNameWarning;
       @FXML
        private AnchorPane pane;

        @FXML
        private AnchorPane pane1;

        @FXML
        private JFXTextField txtUsername;

        @FXML
        private JFXTextField txtPassword;


         private Pattern UserNamePattern;
         private Pattern PasswordPattern;

        public void initialize(){
            UserNamePattern = Pattern.compile("user")/*("^[a-z0-9]{4,}$")*/;
            PasswordPattern = Pattern.compile("password")/*("^[a-zA-Z0-9_]{8,}$")*/;
        }

        @FXML
        void createNewAccountOnAction(ActionEvent event) throws IOException {
                Navigation.navigate(Routes.REGISTER, pane1);
        }

        @FXML
        void fogotPasswordOnAction(javafx.scene.input.MouseEvent mouseEvent) throws IOException {
                Navigation.navigate(Routes.FOGOTPASSWORD, pane1);

        }

        @FXML
        void loginOnAction(ActionEvent event) throws IOException {
            boolean isUserNameMatched = UserNamePattern.matcher(txtUsername.getText()).matches();
            boolean isPasswordMatched = PasswordPattern.matcher(txtPassword.getText()).matches();

            if (isUserNameMatched){
                if (isPasswordMatched){
                    Navigation.navigate(Routes.DASHBOARDPAGE, pane);
               }else {
                System.out.println("Registration fail!");
                    txtPassword.setFocusColor(Paint.valueOf("Red"));
                    //new Alert(Alert.AlertType.WARNING, "Invalid password").show();
                    txtPassword.requestFocus();
                }
            }else{
                System.out.println("Registration Fail!");
                txtUsername.setFocusColor(Paint.valueOf("Red"));
               // new Alert(Alert.AlertType.WARNING, "Invalid username!").show();
                txtUsername.requestFocus();
            }
    }
 }



