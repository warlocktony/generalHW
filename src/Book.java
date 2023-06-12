public class Book {
    String bookName;
    int ageBook;

    public Book(String bookName, int ageBook) {
        this.bookName = bookName;
        this.ageBook = ageBook;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getAgeBook() {
        return this.ageBook;
    }

    public void setAgeBook(int ageBook) {
        this.ageBook = ageBook;
    }
}
