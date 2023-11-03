package Library_V1;

public class Book extends Editions implements Detailable {
    private String bookName;
    private String author;
    private int yearOfEdition;

    public Book(String bookName, String author, int yearOfEdition) {
        this.bookName = bookName;
        this.author = author;
        this.yearOfEdition = yearOfEdition;
    }

    public Book() {
        this.bookName = "Unknown";
        this.author = "Unknown";
        this.yearOfEdition = 2000;
    }

    public String getAuthor() {
        return author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfEdition() {
        return yearOfEdition;
    }

    public void setYearOfEdition(int yearOfEdition) {
        this.yearOfEdition = yearOfEdition;
    }

    @Override
    public void getDetails() {
        System.out.println("Book: " + this.getBookName() + ", Author: " + this.getAuthor());
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", yearOfEdition=" + yearOfEdition +
                '}';
    }
}
