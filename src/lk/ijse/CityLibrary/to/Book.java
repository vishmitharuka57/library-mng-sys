package lk.ijse.CityLibrary.to;

public class Book {
    private String bookId;
    private String bookName;
    private String author;
    private String language;
    private int noOfBooks;
    private String publication;

    public Book() {
    }

    public Book(String bookId, String bookName, String author, String language, int noOfBooks, String publication) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.language = language;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
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
                ", author='" + author + '\'' +
                ", language='" + language + '\'' +
                ", noOfBooks=" + noOfBooks +
                ", publication='" + publication + '\'' +
                '}';
    }
}
