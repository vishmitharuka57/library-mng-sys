package lk.ijse.CityLibrary.to;

public class User {
    private String name ;
    private String userName ;
    private String userId ;
    private String nic ;
    private String address ;
    private String role ;
    private String telephone;
    private String password;

    public User(String id, String name, String nic, String dob, String memberId, String memberName) {
    }

    public User(String name, String userName, String userId, String nic, String address, String role, String telephone, String password) {
        this.name = name;
        this.userName = userName;
        this.userId = userId;
        this.nic = nic;
        this.address = address;
        this.role = role;
        this.telephone = telephone;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", userId='" + userId + '\'' +
                ", nic='" + nic + '\'' +
                ", address='" + address + '\'' +
                ", role='" + role + '\'' +
                ", telephone='" + telephone + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
