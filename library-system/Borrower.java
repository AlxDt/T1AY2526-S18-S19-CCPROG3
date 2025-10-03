import java.util.ArrayList;
import java.time.LocalDate;

public class Borrower {
    // Fields (properties)
    private String name;
    private LocalDate dateRegistered;
    private ArrayList<Book> books;
    private String gender;

    // Methods (behavior)
    public Borrower(String name, LocalDate dateRegistered, String gender) {
        this.name = name;
        this.dateRegistered = dateRegistered;
        this.books = new ArrayList<Book>();
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public LocalDate getLocalDateRegistered() {
        return this.dateRegistered;
    }

    public ArrayList<Book> getBooks() {
        return this.books;
    }

    public String getGender() {
        return this.gender;
    }

    public void borrow(String nameOfBookToBorrow, ArrayList<Book> books) {
        Book book = searchBook(nameOfBookToBorrow, books);

        if (book == null) {
            System.out.println("Cannot borrow the '" + nameOfBookToBorrow + "' because it as not found in the library.");
        } else {
            System.out.println("The book '" + nameOfBookToBorrow + "' has been borrowed successfully.");

            this.books.add(book);         
        }
    }

    public void viewBorrowedBooks() {
        for (Book book : this.books) {
            System.out.println(book.getName());
        }
    }

    private Book searchBook(String nameOfBookToSearch, ArrayList<Book> books) {
        for (Book bookToCheck : books) {
            if (bookToCheck.getName().equalsIgnoreCase(nameOfBookToSearch)) {
                return bookToCheck;
            } 
        }

        return null;
    }
}

