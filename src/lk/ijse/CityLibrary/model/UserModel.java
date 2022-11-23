package lk.ijse.CityLibrary.model;

import lk.ijse.CityLibrary.to.User;
import lk.ijse.CityLibrary.util.CrudUtil;

import java.sql.SQLException;

public class UserModel {
    public static boolean save(User user) throws SQLException, ClassNotFoundException {
            String sql = "INSERT INTO User VALUES (?, ?, ?, ? ,? ,? ,? ,?)";
            return CrudUtil.execute(sql, user.getName(), user.getUserName(), user.getUserId(), user.getRole(),user.getNic(),user.getAddress(),user.getTelephone(),user.getPassword());
    }


}
