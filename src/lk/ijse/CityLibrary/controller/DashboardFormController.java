package lk.ijse.CityLibrary.controller;

import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.time.LocalDate;
import java.time.LocalTime;

public class DashboardFormController {
    public AnchorPane pane;
    public Label lblSetDate;
    public Label lblSetTime;

    public void initialize()  {
        setDate();
        setTime();
    }

    private void setDate() {
//        LocalDate date = LocalDate.now();
//        lblOrderDate.setText(String.valueOf(date));
        lblSetDate.setText(String.valueOf(LocalDate.now()));
    }
    private void setTime() {
//        LocalDate date = LocalDate.now();
//        lblOrderDate.setText(String.valueOf(date));
        lblSetTime.setText(String.valueOf(LocalTime.now()));
    }
}
