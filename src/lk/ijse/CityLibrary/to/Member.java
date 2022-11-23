package lk.ijse.CityLibrary.to;

import java.util.Date;

public class Member {
    private String memberId;
    private String nic;
    private String name ;
    private Date dob;
    private String address;
    private String mobile;

    public Member() {
    }

    public Member(String memberId, String nic, String name, Date dob, String address, String mobile) {
        this.memberId = memberId;
        this.nic = nic;
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.mobile = mobile;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId='" + memberId + '\'' +
                ", nic='" + nic + '\'' +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", address='" + address + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
