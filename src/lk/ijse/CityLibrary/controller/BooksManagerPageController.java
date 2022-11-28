package lk.ijse.CityLibrary.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import lk.ijse.CityLibrary.db.DBConnection;
import lk.ijse.CityLibrary.model.BookModel;
import lk.ijse.CityLibrary.to.Book;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BooksManagerPageController {
    public TextField txtId;
    public TextField txtName;
    public TextField txtLanguage;
    public TextField txtNoOfBooks;
    public TextField txtAuthor;
    public TextField txtPublication;
    public TableColumn colBookId;
    public TableColumn colBookName;
    public TableColumn colLanguage;
    public TableColumn colAuthor;
    public TableColumn colNoOfBooks;
    public TableColumn colPublication;
    public TableView<Book> tblBook;

    public void initialize()  {

        colBookId.setCellValueFactory(new PropertyValueFactory<>("bookId"));
        colBookName.setCellValueFactory(new PropertyValueFactory<>("bookName"));
        colLanguage.setCellValueFactory(new PropertyValueFactory<>("language"));
        colAuthor.setCellValueFactory(new PropertyValueFactory<>("author"));
        colNoOfBooks.setCellValueFactory(new PropertyValueFactory<>("noOfBooks"));
        colPublication.setCellValueFactory(new PropertyValueFactory<>("publication"));

        try {
            loadAllMembers();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    private void loadAllMembers() throws SQLException, ClassNotFoundException {
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM BOOK ");
        ResultSet rst = stm.executeQuery();
        ArrayList<Book> books = new ArrayList<>();
        while (rst.next()){
            books.add(new Book(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getInt(5),
                    rst.getString(6)
            ));


        }
        setUsersToTable(books);
    }

    private void setUsersToTable(ArrayList<Book> books) {
        ObservableList<Book> obList = FXCollections.observableArrayList();
        books.forEach(e ->{
            obList.add(new Book(e.getBookId(), e.getBookName(), e.getLanguage(), e.getAuthor(),e.getNoOfBooks(),e.getPublication()));

        });
        tblBook.setItems(obList);
    }

    public void updateBookOnAction(ActionEvent actionEvent) {
    }

    public void saveBookOnAction(ActionEvent actionEvent) {
        String bookId = txtId.getText();
        String bookName = txtName.getText();
        String language = txtLanguage.getText();
        String author = txtAuthor.getText();
        int noOfBooks = Integer.parseInt(txtNoOfBooks.getText());
        String publication = txtPublication.getText();


        Book book = new Book(bookId, bookName, language, author, noOfBooks, publication);
        try {
            boolean isAdded = BookModel.save(book);

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
