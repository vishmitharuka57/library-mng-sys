package lk.ijse.CityLibrary.to;

public class Donation {
    private String donationId  ;
    private String donorName  ;
    private String donorAddress  ;
    private String donorNic  ;
    private String bookName  ;
    private String bookId  ;
    private String categoryName  ;

    public Donation() {
    }

    public Donation(String donationId, String donorName, String donorAddress, String donorNic, String bookName, String bookId, String categoryName) {
        this.donationId = donationId;
        this.donorName = donorName;
        this.donorAddress = donorAddress;
        this.donorNic = donorNic;
        this.bookName = bookName;
        this.bookId = bookId;
        this.categoryName = categoryName;
    }

    public String getDonationId() {
        return donationId;
    }

    public void setDonationId(String donationId) {
        this.donationId = donationId;
    }

    public String getDonorName() {
        return donorName;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public String getDonorAddress() {
        return donorAddress;
    }

    public void setDonorAddress(String donorAddress) {
        this.donorAddress = donorAddress;
    }

    public String getDonorNic() {
        return donorNic;
    }

    public void setDonorNic(String donorNic) {
        this.donorNic = donorNic;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "Donation{" +
                "donationId='" + donationId + '\'' +
                ", donorName='" + donorName + '\'' +
                ", donorAddress='" + donorAddress + '\'' +
                ", donorNic='" + donorNic + '\'' +
                ", bookName='" + bookName + '\'' +
                ", bookId='" + bookId + '\'' +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}
