package lk.ijse.CityLibrary.to;

public class BookCategory {
    private String categoryId;
    private String categoryName;
    private String bookId ;
    private String bookName;
    private int noOfPages ;
    private String ageLevel ;

    public BookCategory(String categoryId, String categoryName, String bookId, String bookName, int noOfPages, String ageLevel) {
    }

    public BookCategory(String categoryId) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.bookId = bookId;
        this.bookName = bookName;
        this.noOfPages = noOfPages;
        this.ageLevel = ageLevel;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
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

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public String getAgeLevel() {
        return ageLevel;
    }

    public void setAgeLevel(String ageLevel) {
        this.ageLevel = ageLevel;
    }

    @Override
    public String toString() {
        return "BookCategory{" +
                "categoryId='" + categoryId + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", bookId='" + bookId + '\'' +
                ", bookName='" + bookName + '\'' +
                ", noOfPages=" + noOfPages +
                ", ageLevel=" + ageLevel +
                '}';
    }
}
