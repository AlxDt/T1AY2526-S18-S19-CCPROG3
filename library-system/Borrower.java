import java.util.ArrayList;
import java.util.Date;

public class Borrower {
    // Fields (properties)
    private String name;
    private Date dateRegistered;
    private ArrayList<Book> books;
    private String gender;

    // Methods (behavior)
    // - Constructor <- is used to create the object with initial values
    public Borrower(String name, Date dateRegistered, String gender) {
        this.name = name;
        this.dateRegistered = dateRegistered;
        this.books = new ArrayList<Book>();
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public Date getDateRegistered() {
        return this.dateRegistered;
    }

    public ArrayList<Book> getBooks() {
        return this.books;
    }

    public String getGender() {
        return this.gender;
    }
}
