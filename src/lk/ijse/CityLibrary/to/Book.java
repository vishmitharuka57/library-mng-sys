package lk.ijse.CityLibrary.to;

public class Book {
    private String bookId;
    private String bookName;
    private String language;
    private String author;
    private int noOfBooks;
    private String publication;

    public Book(String bookId, String bookName, String language, String author, String noOfBooks, String publication) {
    }

    public Book(String bookId, String bookName, String language, String author, int noOfBooks, String publication) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.language = language;
        this.author = author;
        this.noOfBooks = noOfBooks;
        this.publication = publication;
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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNoOfBooks() {
        return noOfBooks;
    }

    public void setNoOfBooks(int noOfBooks) {
        this.noOfBooks = noOfBooks;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId='" + bookId + '\'' +
                ", bookName='" + bookName + '\'' +
                ", language='" + language + '\'' +
                ", author='" + author + '\'' +
                ", noOfBooks=" + noOfBooks +
                ", publication='" + publication + '\'' +
                '}';
    }
}
