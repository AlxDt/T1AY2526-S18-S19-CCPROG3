import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

public class Driver {
    // Methods
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

            switch (response.toLowerCase()) {
                case "d":
                    showDetails(borrower);

                    break;
                case "l":
                    showBooksOfLibrary(books);

                    break;
                case "m":
                    showBooksOfBorrower(borrower);

                    break;
                // TODO #3: Create a case for the borrow feature (1 pt)
                case "b":
                    borrowBook(borrower, books); 

                    break;
                // TODO: 4: Create a case for the return feature (1 pt)
                case "r":
                    returnBook(borrower, books);

                    break;
                default:
                    if (!response.equalsIgnoreCase("q")) {
                        System.out.println("Invalid input");
                    }

                    break;
            }
        } while (!response.equalsIgnoreCase("Q"));

        scanner.close();
    }

    private static void showDetails(Borrower borrower) {
        System.out.println("[DETAILS]");
        System.out.println("Name: " + borrower.getName());
        System.out.println("Gender: " + borrower.getGender());
        System.out.println("Date registered: " + borrower.getDateRegistered());
    }

    private static void showBooksOfLibrary(ArrayList<Book> books) {
        System.out.println("[BOOKS IN LIBRARY]");

        int bookIndex = 1;

        for (Book book : books) {
            System.out.println(bookIndex + ". " + book.getName() + " || " + book.getIsbn());

            bookIndex++;
        }
    }

    private static void showBooksOfBorrower(Borrower borrower) {
        System.out.println("[BOOKS BORROWED BY " + borrower.getName() + "]");
        
        if (borrower.getBooks().size() == 0) {
            System.out.println(borrower.getName() + " does not have any borrowed books.");
        } else {
            int bookIndex = 1;
            
            for (Book book : borrower.getBooks()) {
                System.out.println(bookIndex + ". " + book.getName() + " || " + book.getIsbn());
                
                bookIndex++;
            }
        }
    }

    private static void borrowBook(Borrower borrower, ArrayList<Book> books) {
        System.out.println("[BORROW A BOOK]");

        // TODO #1: Complete the method contents
        // 1. Ask for the name of the book to borrow; keep asking as long as the user enters a book that
        //    doesn't exist in the library (the books in the library is provided as a method in the parameter) (3 pts)
        // 2. Transfer the book from the library to the borrower. By the end of this step, ensure that the book is
        //    not in the posession of the library anymore: it should be in the posession of the borrower. (5 pts)
        //    (hint: use the methods that already exist in the Book class)
        // 3. Update the book's last borrowed date to the current date (hint: you can RTFM how to get the current date, or you can just look for the answer in this Driver class hehe) (2 pts)





    }

    private static void returnBook(Borrower borrower, ArrayList<Book> books) {
        System.out.println("[RETURN A BOOK]");

        // TODO #2: Complete the method contents
        // 1. Ask for the name of the book to return; keep asking as long as the user entered a book that
        //    doesn't exist in the posession of the borrower (3 pts)
        // 2. Transfer the book from the borrower to the library . By the end of this step, ensure that the book is
        //    not in the posession of the borrower anymore: it should be in the posession of the library (the books in the library is provided as a method in the parameter) (5 pts)
        //    (hint: use the methods that already exist in the Book class)





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
