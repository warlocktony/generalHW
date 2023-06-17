import java.util.Objects;

public class Book {
    private final String bookName;
    private final Author author;
    private int ageBook;

    public Book(String bookName, Author author, int ageBook) {
        this.bookName = bookName;
        this.author = author;
        this.ageBook = ageBook;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getAgeBook() {
        return this.ageBook;
    }

    public void setAgeBook(int ageBook) {
        this.ageBook = ageBook;
    }

    @Override
    public String toString() {
        return "book - " + this.bookName + " ; " + author.toString() + " age - " + this.ageBook;
    }

    @Override
    public boolean equals(Object x) {
        if (this == x) {
            return true;
        }

        if (x == null || getClass() != x.getClass()) {
            return false;
        }

        Book book = (Book) x;

        return Objects.equals(bookName, book.bookName) && Objects.equals(ageBook, book.ageBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, ageBook);
    }

}
