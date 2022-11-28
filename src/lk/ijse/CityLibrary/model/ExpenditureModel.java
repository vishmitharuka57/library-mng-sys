package lk.ijse.CityLibrary.model;

import lk.ijse.CityLibrary.to.Expenditure;
import lk.ijse.CityLibrary.util.CrudUtil;

import java.sql.SQLException;

public class ExpenditureModel {
    public static boolean save(Expenditure expenditure) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO EXPENDITURE VALUES (?, ?, ?, ? ,?  )";
        return CrudUtil.execute(sql, expenditure.getExpenditureId(), expenditure.getDescription(), expenditure.getAmount(),
                expenditure.getDate(),expenditure.getInvoiceNo());

    }
}
