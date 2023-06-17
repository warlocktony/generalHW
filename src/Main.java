public class Main {
    public static void main(String[] args) {

        Author authorOfTomSawyer = new Author("Mark ", " Twain");

        Book bookTomSawyer = new Book("Tom Sawyer", authorOfTomSawyer, 1876);

        System.out.println(bookTomSawyer);


        Author authorOfTheLordOfRings = new Author("John ", " Tolkien");

        Book bookTheLordOfRings = new Book("The Lord of Rings", authorOfTheLordOfRings, 1954);

        System.out.println(bookTheLordOfRings);


        System.out.println(authorOfTomSawyer.equals(authorOfTheLordOfRings));

        System.out.println(bookTomSawyer.equals(bookTheLordOfRings));

    }
}
