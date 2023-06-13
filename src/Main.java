public class Main {
    public static void main(String[] args) {

        Author authorOfTomSawyer = new Author("Mark ", " Twain");

        Book bookTomSawyer = new Book("Tom Sawyer", authorOfTomSawyer , 1876);

        System.out.println("Book - " + bookTomSawyer.getBookName());
        System.out.println("Age - " + bookTomSawyer.getAgeBook());
        bookTomSawyer.setAgeBook(1877);
        System.out.println("bookTomSawyer.getAgeBook() = " + bookTomSawyer.getAgeBook());

        System.out.println("Author first name - " + authorOfTomSawyer.getFirstName());
        System.out.println("Author second name - " + authorOfTomSawyer.getSecondName());


        Author authorOfTheLordOfRings = new Author("John ", " Tolkien");

        Book bookTheLordOfRings = new Book("The Lord of Rings", authorOfTheLordOfRings, 1954 );

        System.out.println("Book - " + bookTheLordOfRings.getBookName());
        System.out.println("Age - " + bookTheLordOfRings.getAgeBook());
        bookTheLordOfRings.setAgeBook(1955);
        System.out.println("bookTheLordOfRings.getAgeBook() = " + bookTheLordOfRings.getAgeBook());
        System.out.println("Author first name - " + authorOfTheLordOfRings.getFirstName());
        System.out.println("Author second name - " + authorOfTheLordOfRings.getSecondName());

    }
}