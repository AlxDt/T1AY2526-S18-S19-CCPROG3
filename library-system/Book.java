import java.time.LocalDate;

public class Book {
    private String name;
    private String isbn;
    private String[] authors;
    private LocalDate published;
    private LocalDate lastBorrowed;
    private String edition;

    public Book(
        String name,
        String isbn,
        String[] authors,
        LocalDate published,
        String edition
    ) {
        this.name = name;
        this.isbn = isbn;
        this.authors = authors;
        this.published = published;
        this.edition = edition;
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

    public LocalDate getPublished() {
        return this.published;
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
}
