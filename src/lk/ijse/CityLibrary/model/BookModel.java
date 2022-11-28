package lk.ijse.CityLibrary.model;

import lk.ijse.CityLibrary.to.Book;
import lk.ijse.CityLibrary.util.CrudUtil;

import java.sql.SQLException;

public class BookModel {
    public static boolean save(Book book) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO BOOK VALUES (?, ?, ?, ? ,? ,? )";
        return CrudUtil.execute(sql, book.getBookId(), book.getBookName(), book.getLanguage(),
                book.getAuthor(),book.getNoOfBooks(),book.getPublication());

    }
}
