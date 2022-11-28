package lk.ijse.CityLibrary.model;

import lk.ijse.CityLibrary.to.Employee;
import lk.ijse.CityLibrary.util.CrudUtil;

import java.sql.SQLException;

public class EmployeeModel {
    public static boolean save(Employee employee) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO EMPLOYEE VALUES (?, ?, ?, ? ,? ,?, ? )";
        return CrudUtil.execute(sql, employee.getEmpId(), employee.getEmpName(), employee.getDepartment(),
                employee.getDob(),employee.getNic(),employee.getAddress(),employee.getDescription());

    }
}
