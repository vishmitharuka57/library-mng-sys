package lk.ijse.CityLibrary.model;

import lk.ijse.CityLibrary.to.Donation;
import lk.ijse.CityLibrary.util.CrudUtil;

import java.sql.SQLException;

public class DonationModel {
    public static boolean save(Donation donation) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO DONATION VALUES (?, ?, ?, ? ,? ,?, ? )";
        return CrudUtil.execute(sql, donation.getDonationId(), donation.getDonorName(), donation.getDonorAddress(),
                donation.getDonorNic(),donation.getBookName(),donation.getBookId(),donation.getCategoryName());

    }
}
