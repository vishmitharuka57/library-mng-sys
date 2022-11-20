package lk.ijse.CityLibrary.controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;
import lk.ijse.CityLibrary.util.Navigation;
import lk.ijse.CityLibrary.util.Routes;

import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.regex.Pattern;

public class LoginPageController {
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
            UserNamePattern = Pattern.compile("vishmiPK")/*("^[a-z0-9]{4,}$")*/;
            PasswordPattern = Pattern.compile("hello123")/*("^[a-zA-Z0-9_]{8,}$")*/;
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

            /*if (isUserNameMatched){
                if (isPasswordMatched){*/
                    Navigation.navigate(Routes.DASHBOARDPAGE, pane);
              /*  }else {
                        txtRole.setFocusColor(Paint.valueOf("Red"));
                        txtRole.requestFocus();
                }
            }else {
                txtRole.setFocusColor(Paint.valueOf("Red"));
                txtRole.requestFocus();*/




        }


}


