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

    public LocalDate getDateRegistered() {
        return this.dateRegistered;
    }

    public ArrayList<Book> getBooks() {
        return this.books;
    }

    public String getGender() {
        return this.gender;
    }

    public void borrowBook(String nameOfBookToBorrow, ArrayList<Book> books) {
        Book book = searchBook(nameOfBookToBorrow, books);

        if (book == null) {
            System.out.println("Cannot borrow the '" + nameOfBookToBorrow + "' because it was not found in the library.");
        } else {
            System.out.println("The book '" + nameOfBookToBorrow + "' has been borrowed successfully.");

            this.books.add(book);         
        }
    }

    public Book returnBook(String nameOfBook) {
        Book book = searchBook(nameOfBook, this.books);
        
        if (book == null) {
            System.out.println("Cannot return the '" + nameOfBook + "' because " + this.name + " does not have it.");
        } else {
            this.books.remove(book);
        }
        
        return book;
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

