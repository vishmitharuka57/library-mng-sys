package lk.ijse.CityLibrary.to;

public class Employee {
    private String empId ;
    private String empName;
    private String department ;
    private String dob ;
    private String nic;
    private String address;
    private String description;

    public Employee() {
    }

    public Employee(String empId, String empName, String department, String dob, String nic, String address, String description) {
        this.empId = empId;
        this.empName = empName;
        this.department = department;
        this.dob = dob;
        this.nic = nic;
        this.address = address;
        this.description = description;
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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "EmployeeModel{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", department='" + department + '\'' +
                ", dob='" + dob + '\'' +
                ", nic='" + nic + '\'' +
                ", address='" + address + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
