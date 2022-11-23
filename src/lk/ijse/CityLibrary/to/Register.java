package lk.ijse.CityLibrary.to;

public class Register {
    private String name;
    private String username;
    private String role;
    private String password;

    public Register() {
    }

    public Register(String FName, String LName, String username, String role, String password) {
        this.name = FName;
        this.username = username;
        this.role = role;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Register{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", role='" + role + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
