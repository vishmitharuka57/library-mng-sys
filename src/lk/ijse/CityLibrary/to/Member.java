package lk.ijse.CityLibrary.to;

public class Member {
    private String memberId;
    private String memberName;
    private String nic ;
    private String dob;
    private String address;
    private String mobile;

    public Member(String empId, String empName, String department, String dob, String nic, String address, String description) {
    }

    public Member(String memberId, String memberName, String nic, String dob, String address, String mobile) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.nic = nic;
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

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
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
                ", memberName='" + memberName + '\'' +
                ", nic='" + nic + '\'' +
                ", dob='" + dob + '\'' +
                ", address='" + address + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
