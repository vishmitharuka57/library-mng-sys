package lk.ijse.CityLibrary.model;

import lk.ijse.CityLibrary.to.BookCategory;
import lk.ijse.CityLibrary.util.CrudUtil;

import java.sql.SQLException;

public class CategoryModel {
    public static boolean save(BookCategory bookCategory) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO BOOKCATEGORY VALUES (?, ?, ?, ? ,? ,? )";
        return CrudUtil.execute(sql, bookCategory.getCategoryId(), bookCategory.getCategoryName(), bookCategory.getBookId(),
                bookCategory.getBookName(),bookCategory.getNoOfPages(),bookCategory.getAgeLevel());

    }
}
