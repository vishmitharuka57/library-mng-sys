package lk.ijse.CityLibrary.to;

public class UserPermission {
    private String roleName;
    private String permission ;

    public UserPermission() {
    }

    public UserPermission(String roleName, String permission) {
        this.roleName = roleName;
        this.permission = permission;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    @Override
    public String toString() {
        return "UserPermission{" +
                "roleName='" + roleName + '\'' +
                ", permission='" + permission + '\'' +
                '}';
    }
}
