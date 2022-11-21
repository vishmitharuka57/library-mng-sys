package lk.ijse.CityLibrary.to;

public class User {
    private String userId;
    private String nic;
    private String userName;
    private String address;
    private String telephone;
    private String role ;

    public User() {
    }

    public User(String userId, String nic, String userName, String address, String telephone, String role) {
        this.userId = userId;
        this.nic = nic;
        this.userName = userName;
        this.address = address;
        this.telephone = telephone;
        this.role = role;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", nic='" + nic + '\'' +
                ", userName='" + userName + '\'' +
                ", address='" + address + '\'' +
                ", telephone='" + telephone + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
