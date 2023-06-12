public class Main {
    public static void main(String[] args) {
        Book bookTomSawyer = new Book("Tom Sawyer", 1876);

        System.out.println("Book - " + bookTomSawyer.getBookName());
        System.out.println("Age - " + bookTomSawyer.getAgeBook());

        Author authorOfTomSawyer = new Author("Mark Twain");

        System.out.println("Author - " + authorOfTomSawyer.getFirstAndSecondName());




        Book bookTheLordOfRings = new Book("The Lord of Rings", 1954 );

        System.out.println("Book - " + bookTheLordOfRings.getBookName());
        System.out.println("Age - " + bookTheLordOfRings.getAgeBook());

        Author authorOfTheLordOfRings = new Author("John Tolkien");

        System.out.println("Author - " + authorOfTheLordOfRings.getFirstAndSecondName());


    }
}