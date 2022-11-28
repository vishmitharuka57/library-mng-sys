package lk.ijse.CityLibrary.model;

import lk.ijse.CityLibrary.to.Member;
import lk.ijse.CityLibrary.util.CrudUtil;

import java.sql.SQLException;

public class MemberModel {
    public static boolean save(Member member) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO MEMBER VALUES (?, ?, ?, ? ,? ,? )";
        return CrudUtil.execute(sql, member.getMemberId(), member.getMemberName(), member.getNic(),
                member.getDob(),member.getAddress(),member.getMobile());

    }
}
