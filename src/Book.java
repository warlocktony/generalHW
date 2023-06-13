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
}
