package lk.ijse.CityLibrary.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import lk.ijse.CityLibrary.db.DBConnection;
import lk.ijse.CityLibrary.model.CategoryModel;
import lk.ijse.CityLibrary.to.BookCategory;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CategoryManagePageController {
    public ComboBox cmbShowAllCategories;
    public TextField txtCategoryName;
    public TextField txtBookId;
    public TextField txtNoOfPages;
    public TextField txtBookName;
    public TextField txtAgeLevel;
    public TextField txtCategoryId;

    public void initialize()  {
       cmbShowAllCategories.getItems().addAll(txtCategoryName.getText());
        try {
            loadAllCategories();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void loadAllCategories() throws SQLException, ClassNotFoundException {
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("SELECT categoryName FROM BOOKCATEGORY");
        ResultSet rst = stm.executeQuery();
        ArrayList<BookCategory> bookCategories = new ArrayList<>();

        cmbShowAllCategories(bookCategories);
    }

    private void cmbShowAllCategories(ArrayList<BookCategory> bookCategories) {
        ObservableList<BookCategory> obList = FXCollections.observableArrayList();
        bookCategories.forEach(e ->{
            obList.add(new BookCategory(e.getBookId()));

        });
        cmbShowAllCategories.setItems(obList);
    }


    public void btnUpdateOnAction(ActionEvent actionEvent) {
    }

    public void btnCreateCategoryOnAction(ActionEvent actionEvent) {
        String categoryId = txtCategoryId.getText();
        String categoryName = txtCategoryName.getText();
        String bookId = txtBookId.getText();
        String bookName = txtBookName.getText();
        int noOfPages = Integer.parseInt(txtNoOfPages.getText());
        String ageLevel = txtAgeLevel.getText();


        BookCategory bookCategory = new BookCategory(categoryId,categoryName,bookId, bookName, noOfPages, ageLevel);
        try {
            boolean isAdded = CategoryModel.save(bookCategory);

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
