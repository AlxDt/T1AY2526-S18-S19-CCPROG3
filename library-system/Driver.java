import java.util.ArrayList;
import java.util.Date;

public class Driver {
    public static void main(String[] args) {
        // Scenario: We have a set of books, and we want to borrow some books
        System.out.println("Welcome to the library!");
        
        // Step #1: Assemble the objects
        ArrayList<Book> books = generateBooks();

        // TODO: #1 The Date class is deprecated - can you do some research to see what more modern classes we can use instead? After that, replace
        // ALL usages of the Date class with that new class
        // Hint: Explore the java.time library. :)
        
        Date dateRegistered = new Date(2025, 9, 26);
        Borrower borrower = new Borrower("Alex Dela Torre", dateRegistered, "Male");

        // Step #2: Orchestrate the objects
        // Borrowing a book is an action/behavior done by the borrower

        // TODO: #2 Change the logic of borrow() such that it ignores the casing of the search query
        borrower.borrow("The story of us", books);

        // TODO: #4 Call the viewBorrowedBooks() method you created
    } 

    private static ArrayList<Book> generateBooks() {
        ArrayList<Book> books = new ArrayList<>();

        String[] book1Authors = new String[] { "Alex Dela Torre", "Karl Daniel" };
        Date book1DatePublished = new Date(1999, 10, 31);

        String[] book2Authors = new String[] { "Nigel Danz" };
        Date book2DatePublished = new Date(2016, 11, 7);

        String[] book3Authors = new String[] { "Mario Salandanan" };
        Date book3DatePublished = new Date(1985, 1, 31);

        String[] book4Authors = new String[] { "Benry Alcantara", "Mark Biller" };
        Date book4DatePublished = new Date(2025, 6, 25);

        String[] book5Authors = new String[] { "Nishimura Nanase", "Nakao Yamaguchi", "Shinzo Kawada" };
        Date book5DatePublished = new Date(2025, 6, 2);

        Book book1 = new Book("The Story of Us", "123-3-13-567325-2", book1Authors, book1DatePublished, "1st Edition");
        Book book2 = new Book("Random Names", "195-3-10-067055-0", book2Authors, book2DatePublished, "Special Edition");
        Book book3 = new Book("Nightmare in Manila", "583-1-94-500321-1", book3Authors, book3DatePublished, "2nd Edition");
        Book book4 = new Book("Ghost Project Stories", "858-1-11-569325-4", book4Authors, book4DatePublished, "11th Edition");
        Book book5 = new Book("Kimetsu no Yaiba: A Review", "159-0-75-785391-6", book5Authors, book5DatePublished, "Limited Edition");

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        return books;
    }
}
