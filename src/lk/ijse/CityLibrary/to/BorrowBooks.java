package lk.ijse.CityLibrary.to;

public class BorrowBooks {
    private String memberId ;
    private String memberName;
    private int noOfDays;
    private boolean damageOrNot ;
    private String bookId ;
    private String categoryName ;
    String borrowId;
    String bookName;
    String status;
    String borrowDate;
    String returnDate;
    String fineId ;

    public BorrowBooks() {
    }

    public BorrowBooks(String memberId, String memberName, int noOfDays, boolean damageOrNot, String bookId, String categoryName, String borrowId, String bookName, String status, String borrowDate, String returnDate, String fineId) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.noOfDays = noOfDays;
        this.damageOrNot = damageOrNot;
        this.bookId = bookId;
        this.categoryName = categoryName;
        this.borrowId = borrowId;
        this.bookName = bookName;
        this.status = status;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.fineId = fineId;
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

    public int getNoOfDays() {
        return noOfDays;
    }

    public void setNoOfDays(int noOfDays) {
        this.noOfDays = noOfDays;
    }

    public boolean isDamageOrNot() {
        return damageOrNot;
    }

    public void setDamageOrNot(boolean damageOrNot) {
        this.damageOrNot = damageOrNot;
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
        return "BorrowBooks{" +
                "memberId='" + memberId + '\'' +
                ", memberName='" + memberName + '\'' +
                ", noOfDays=" + noOfDays +
                ", damageOrNot=" + damageOrNot +
                ", bookId='" + bookId + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", borrowId='" + borrowId + '\'' +
                ", bookName='" + bookName + '\'' +
                ", status='" + status + '\'' +
                ", borrowDate='" + borrowDate + '\'' +
                ", returnDate='" + returnDate + '\'' +
                ", fineId='" + fineId + '\'' +
                '}';
    }
}
