import java.util.Date;

public class Book {
    private String name;
    private String isbn;
    private String[] authors;
    private Date published;
    private Date lastBorrowed;
    private String edition;

    public Book(
        String name,
        String isbn,
        String[] authors,
        Date published,
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

    public Date getPublished() {
        return this.published;
    }

    public Date getLastBorrowed() {
        return this.lastBorrowed;
    }

    public void setLastBorrowed(Date lastBorrowed) {
        this.lastBorrowed = lastBorrowed;
    }

    public String getEdition() {
        return this.edition;
    }
}
