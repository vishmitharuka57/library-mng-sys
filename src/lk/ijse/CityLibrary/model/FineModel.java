package lk.ijse.CityLibrary.model;

import lk.ijse.CityLibrary.to.Fine;
import lk.ijse.CityLibrary.util.CrudUtil;

import java.sql.SQLException;

public class FineModel {
    public static boolean save(Fine fine) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO FINE VALUES (?, ?, ?, ? ,? ,?, ?, ? )";
        return CrudUtil.execute(sql, fine.getFineId(), fine.getMemberId(), fine.getBookId(),
                fine.getBorrowedDate(),fine.getReturnedDate(),fine.getNoOfDays(),fine.isPaidOrNot());

    }
}
