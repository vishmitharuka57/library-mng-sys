package lk.ijse.CityLibrary.to;

public class EmployeeSalary {
    private String empId;
    private String empName;
    private String department;
    private int attendanceCount;
    private String role;
    private double amountPerDay;
    private double salary;
    private boolean distributeOrNot;

    public EmployeeSalary(String empId, String empName, String department, int attendanceCount, String role, double amountPerDay, double salary, boolean distributeOrNot) {
        this.empId = empId;
        this.empName = empName;
        this.department = department;
        this.attendanceCount = attendanceCount;
        this.role = role;
        this.amountPerDay = amountPerDay;
        this.salary = salary;
        this.distributeOrNot = distributeOrNot;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAttendanceCount() {
        return attendanceCount;
    }

    public void setAttendanceCount(int attendanceCount) {
        this.attendanceCount = attendanceCount;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getAmountPerDay() {
        return amountPerDay;
    }

    public void setAmountPerDay(double amountPerDay) {
        this.amountPerDay = amountPerDay;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isDistributeOrNot() {
        return distributeOrNot;
    }

    public void setDistributeOrNot(boolean distributeOrNot) {
        this.distributeOrNot = distributeOrNot;
    }
}
