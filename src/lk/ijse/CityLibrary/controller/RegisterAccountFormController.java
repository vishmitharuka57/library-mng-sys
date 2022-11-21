package lk.ijse.CityLibrary.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import lk.ijse.CityLibrary.util.Navigation;
import lk.ijse.CityLibrary.util.Routes;

import java.io.IOException;

public class RegisterAccountFormController {
    @FXML
    private AnchorPane pane;

    public void openLoginPage(MouseEvent mouseEvent) {
    }

    public void createAndSaveAccount(ActionEvent actionEvent) throws IOException {

        Navigation.navigate(Routes.DASHBOARDPAGE, pane);
    }
}
