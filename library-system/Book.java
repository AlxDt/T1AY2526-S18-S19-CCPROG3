import java.time.LocalDate;
import java.util.Random;

public class Book extends Item {
    private String name;
    private String isbn;
    private String[] authors;
    private LocalDate lastBorrowed;
    private String edition;

    public Book(
        String name,
        String isbn,
        String[] authors,
        LocalDate published,
        String edition
    ) {
       super (published);
        this.name = name;
        this.isbn = isbn;
        this.authors = authors;
        this.edition = edition;
    }

    public Book(
        String name,
        String isbn,
        String[] authors,
        LocalDate published
    ) {
        // Call the OTHER constructor
        // Constructor chaining
        this(name, isbn, authors, published, null);
    }

    public String getName() {
        return this.name;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public String[] getAuthors() {
        return this.authors;
    }


    public LocalDate getLastBorrowed() {
        return this.lastBorrowed;
    }

    public void setLastBorrowed(LocalDate lastBorrowed) {
        this.lastBorrowed = lastBorrowed;
    }

    public String getEdition() {
        return this.edition;
    }

    // An override is when a child replaces the behavior of its parent
    // In this case, the child is replacing the behavior of the generation of the parent's serial number
    @Override
    public String generateSerialNumber() {
        String serialNumber = "";

        // Book: Bxxxx
        serialNumber += "BOK";
        serialNumber += super.generateSerialNumber();

        return serialNumber;
    }
    
    @Override
    public String toString() {
        return super.getSerialNumber() + " " + this.name + " || " + this.isbn;
    }
}
