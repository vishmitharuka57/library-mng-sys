package lk.ijse.CityLibrary.to;

public class Fine {
    private String fineId;
    private String memberId ;
    private String bookId ;
    private String borrowedDate;
    private String returnedDate ;
    private int  NoOfDays ;
    private double amount;
    private boolean paidOrNot;

    public Fine(String string, String rstString, String bookId, String borrowedDate, String returnedDate, String s, String string1, String rstString1) {
    }

    public Fine(String fineId, String memberId, String bookId, String borrowedDate, String returnedDate, int noOfDays, double amount, boolean paidOrNot) {
        this.fineId = fineId;
        this.memberId = memberId;
        this.bookId = bookId;
        this.borrowedDate = borrowedDate;
        this.returnedDate = returnedDate;
        NoOfDays = noOfDays;
        this.amount = amount;
        this.paidOrNot = paidOrNot;
    }

    public String getFineId() {
        return fineId;
    }

    public void setFineId(String fineId) {
        this.fineId = fineId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBorrowedDate() {
        return borrowedDate;
    }

    public void setBorrowedDate(String borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public String getReturnedDate() {
        return returnedDate;
    }

    public void setReturnedDate(String returnedDate) {
        this.returnedDate = returnedDate;
    }

    public int getNoOfDays() {
        return NoOfDays;
    }

    public void setNoOfDays(int noOfDays) {
        NoOfDays = noOfDays;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isPaidOrNot() {
        return paidOrNot;
    }

    public void setPaidOrNot(boolean paidOrNot) {
        this.paidOrNot = paidOrNot;
    }

    @Override
    public String toString() {
        return "Fine{" +
                "fineId='" + fineId + '\'' +
                ", memberId='" + memberId + '\'' +
                ", bookId='" + bookId + '\'' +
                ", borrowedDate='" + borrowedDate + '\'' +
                ", returnedDate='" + returnedDate + '\'' +
                ", NoOfDays=" + NoOfDays +
                ", amount=" + amount +
                ", paidOrNot=" + paidOrNot +
                '}';
    }
}
