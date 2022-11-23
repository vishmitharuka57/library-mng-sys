package lk.ijse.CityLibrary.to;

public class Donation {
    private String donationId ;
    private String bookId ;
    private String bookName ;
    private String categoryName ;
    private String personName ;
    private String personAddress ;
    String nic ;

    public Donation() {
    }

    public Donation(String donationId, String bookId, String bookName, String categoryName, String personName, String personAddress, String nic) {
        this.donationId = donationId;
        this.bookId = bookId;
        this.bookName = bookName;
        this.categoryName = categoryName;
        this.personName = personName;
        this.personAddress = personAddress;
        this.nic = nic;
    }

    public String getDonationId() {
        return donationId;
    }

    public void setDonationId(String donationId) {
        this.donationId = donationId;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonAddress() {
        return personAddress;
    }

    public void setPersonAddress(String personAddress) {
        this.personAddress = personAddress;
    }

    @Override
    public String toString() {
        return "Donation{" +
                "donationId='" + donationId + '\'' +
                ", bookId='" + bookId + '\'' +
                ", bookName='" + bookName + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", personName='" + personName + '\'' +
                ", personAddress='" + personAddress + '\'' +
                ", nic='" + nic + '\'' +
                '}';
    }
}
