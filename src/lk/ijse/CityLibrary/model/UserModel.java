package lk.ijse.CityLibrary.model;

import lk.ijse.CityLibrary.to.User;
import lk.ijse.CityLibrary.util.CrudUtil;

import java.sql.SQLException;

public class UserModel {
    public static boolean save(User user) throws SQLException, ClassNotFoundException {
            String sql = "INSERT INTO USER VALUES (?, ?, ?, ? ,? ,? ,? ,?)";
            return CrudUtil.execute(sql, user.getName(), user.getUserName(), user.getUserId(),
                    user.getRole(),user.getNic(),user.getAddress(),user.getTelephone(),user.getPassword());

    }



    /*public static User search(String id) throws SQLException, ClassNotFoundException {
        String sql = "SELECT  * FROM USER WHERE userId =? ";
        ResultSet result = CrudUtil.execute(sql, id);

        if (result.next()) {
            return new User(
                    result.getString(1),
                    result.getString(2),
                    result.getString(3),
                    result.getString(4),
                    result.getString(1),
                    result.getString(2),
                    result.getString(3),
                    result.getString(4)
            );
        }
        return null;
    }*/

   /* public static ArrayList<String> loadUserIds() throws SQLException, ClassNotFoundException {
        String sql = "SELECT userId FROM Customer";
        ResultSet result = CrudUtil.execute(sql);

        ArrayList<String> idList = new ArrayList<>();

        while (result.next()) {
            idList.add(result.getString(1));
        }
        return idList;
    }*/



}
