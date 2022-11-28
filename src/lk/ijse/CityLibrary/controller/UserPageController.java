package lk.ijse.CityLibrary.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import lk.ijse.CityLibrary.db.DBConnection;
import lk.ijse.CityLibrary.to.User;
import lk.ijse.CityLibrary.to.UserPermission;
import lk.ijse.CityLibrary.util.Navigation;
import lk.ijse.CityLibrary.util.Routes;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserPageController {

    public AnchorPane pane;
    @FXML
    private TableView<User> tblUserDetail;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colUserName;

    @FXML
    private TableColumn<?, ?> colUserId;

    @FXML
    private TableColumn<?, ?> colNic;

    @FXML
    private TableColumn<?, ?> colAddress;

    @FXML
    private TableColumn<?, ?> colRole;

    @FXML
    private TableColumn<?, ?> colTelephone;

    @FXML
    private TableColumn<?, ?> colPassword;

    @FXML
    private TableView<UserPermission> tblPermisson;

    @FXML
    private TableColumn<?, ?> colROLENAME;

    @FXML
    private TableColumn<?, ?> colPERMISSION;


    public void initialize()  {

        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colUserName.setCellValueFactory(new PropertyValueFactory<>("userName"));
        colUserId.setCellValueFactory(new PropertyValueFactory<>("userId"));
        colNic.setCellValueFactory(new PropertyValueFactory<>("nic"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colRole.setCellValueFactory(new PropertyValueFactory<>("role"));
        colTelephone.setCellValueFactory(new PropertyValueFactory<>("telephone"));
        colPassword.setCellValueFactory(new PropertyValueFactory<>("password"));

        colROLENAME.setCellValueFactory(new PropertyValueFactory<>("roleName"));
        colPERMISSION.setCellValueFactory(new PropertyValueFactory<>("permission"));

        try {
            loadAllUsers();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            loadAllPermissions();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void loadAllUsers() throws SQLException, ClassNotFoundException {
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM USER ");
        ResultSet rst = stm.executeQuery();
        ArrayList<User> users = new ArrayList<>();
        while (rst.next()){
            users.add(new User(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getString(7),
                    rst.getString(8)
            ));


        }
        setUsersToTable(users);

    }
    private void setUsersToTable(ArrayList<User> users) {
        ObservableList<User> obList = FXCollections.observableArrayList();
        users.forEach(e ->{
            obList.add(new User(e.getName(), e.getUserName(), e.getUserId(), e.getRole(), e.getNic(), e.getAddress(), e.getTelephone(), e.getPassword()));

        });
        tblUserDetail.setItems(obList);
    }

    private void loadAllPermissions() throws SQLException, ClassNotFoundException {
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM USERPERMISSION ");
        ResultSet rst = stm.executeQuery();
        ArrayList<UserPermission> usersPermission = new ArrayList<>();
        while (rst.next()){
            usersPermission.add(new UserPermission(
                    rst.getString(1),
                    rst.getString(2)
            ));


        }
        setUserPermissionsToTable(usersPermission);
    }

    private void setUserPermissionsToTable(ArrayList<UserPermission> usersPermission) {
        ObservableList<UserPermission> obList = FXCollections.observableArrayList();
        usersPermission.forEach(e ->{
            obList.add(new UserPermission(e.getRoleName(), e.getPermission()));

        });
        tblPermisson.setItems(obList);
    }

    @FXML
    void updateOnAction(ActionEvent event) throws IOException {
        Navigation.navigate(Routes.UPDATE, pane);
    }

    public void deleteOnAction(ActionEvent actionEvent) {
    }
}