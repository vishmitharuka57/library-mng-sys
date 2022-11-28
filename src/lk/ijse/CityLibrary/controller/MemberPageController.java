package lk.ijse.CityLibrary.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import lk.ijse.CityLibrary.db.DBConnection;
import lk.ijse.CityLibrary.model.MemberModel;
import lk.ijse.CityLibrary.to.Member;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberPageController {
    public TableView<Member> tblMemberDetail;
    @FXML
    private TableColumn<?, ?> colMemberId;

    @FXML
    private TableColumn<?, ?> colMemberName;

    @FXML
    private TableColumn<?, ?> colMemberNic;

    @FXML
    private TableColumn<?, ?> colMemberDob;

    @FXML
    private TableColumn<?, ?> colMemberAddress;

    @FXML
    private TableColumn<?, ?> colMemberMobile;

    @FXML
    private TextField txtMemberId;

    @FXML
    private TextField txtMemberName;

    @FXML
    private TextField txtMemberNic;

    @FXML
    private TextField txtMemberDob;

    @FXML
    private TextField txtMemberMobile;

    @FXML
    private TextField txtMemberAddress;

    public void initialize()  {

        colMemberId.setCellValueFactory(new PropertyValueFactory<>("memberId"));
        colMemberName.setCellValueFactory(new PropertyValueFactory<>("memberName"));
        colMemberNic.setCellValueFactory(new PropertyValueFactory<>("nic"));
        colMemberDob.setCellValueFactory(new PropertyValueFactory<>("dob"));
        colMemberAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colMemberMobile.setCellValueFactory(new PropertyValueFactory<>("mobile"));

        try {
            loadAllMembers();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    private void loadAllMembers() throws SQLException, ClassNotFoundException {
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM MEMBER ");
        ResultSet rst = stm.executeQuery();
        ArrayList<Member> members = new ArrayList<>();
        while (rst.next()){
            members.add(new Member(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6)
            ));


        }
        setUsersToTable(members);
    }

    private void setUsersToTable(ArrayList<Member> members) {
        ObservableList<Member> obList = FXCollections.observableArrayList();
        members.forEach(e ->{
            obList.add(new Member(e.getMemberId(), e.getMemberName(), e.getNic(), e.getDob(),e.getAddress(),e.getMobile()));

        });
        tblMemberDetail.setItems(obList);

    }


    @FXML
    void btnSaveOnAction(ActionEvent event) {
        String memberId = txtMemberId.getText();
        String memberName = txtMemberName.getText();
        String nic = txtMemberNic.getText();
        String dob = txtMemberDob.getText();
        String address = txtMemberAddress.getText();
        String mobile = txtMemberMobile.getText();


        Member member = new Member(memberId, memberName, nic, dob, address, mobile);
        try {
            boolean isAdded = MemberModel.save(member);

            if (isAdded) {
                new Alert(Alert.AlertType.CONFIRMATION, "Customer Added!").show();
            } else {
                new Alert(Alert.AlertType.WARNING, "Something happened!").show();
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {

    }
}
