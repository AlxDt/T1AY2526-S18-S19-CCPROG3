import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Book> books = generateBooks();

        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        System.out.print("What is your gender? ");
        String gender = scanner.nextLine();

        LocalDate dateRegistered = LocalDate.now();

        Borrower borrower = new Borrower(name, dateRegistered, gender);

        System.out.println();
        System.out.println("Welcome to the library, " + borrower.getName() + "!");

        String response;

        do {
            System.out.println();
            System.out.println("Show my [d]etails");
            System.out.println("List the books in the [l]ibrary");
            System.out.println("List the books I have with [m]e");
            System.out.println("[B]orrow a book");
            System.out.println("[R]eturn a book");
            System.out.println("[Q]uit");
            System.out.println();
            System.out.print("What do you want to do? ");

            response = scanner.nextLine();
        } while (!response.equalsIgnoreCase("Q"));

        scanner.close();
    } 

    private static ArrayList<Book> generateBooks() {
        ArrayList<Book> books = new ArrayList<>();

        String[] book1Authors = new String[] { "Alex Dela Torre", "Karl Daniel" };
        LocalDate book1DatePublished = LocalDate.of(1999, 10, 31);

        String[] book2Authors = new String[] { "Nigel Danz" };
        LocalDate book2DatePublished = LocalDate.of(2016, 11, 7);

        String[] book3Authors = new String[] { "Mario Salandanan" };
        LocalDate book3DatePublished = LocalDate.of(1985, 1, 31);

        String[] book4Authors = new String[] { "Benry Alcantara", "Mark Biller" };
        LocalDate book4DatePublished = LocalDate.of(2025, 6, 25);

        String[] book5Authors = new String[] { "Nishimura Nanase", "Nakao Yamaguchi", "Shinzo Kawada" };
        LocalDate book5DatePublished = LocalDate.of(2025, 6, 2);

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
