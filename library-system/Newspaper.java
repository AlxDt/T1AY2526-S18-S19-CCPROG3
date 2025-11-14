import java.time.LocalDate;
import java.util.Random;

public class Newspaper extends Item {
    private String publisher;
    private String headline;

    public Newspaper(
        LocalDate published,
        String publisher,
        String headline) {
            super (published);
            this.publisher = publisher;
            this.headline = headline;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getHeadline() {
        return headline;
    }

    @Override
    public String generateSerialNumber() {
        String serialNumber = "";

        // Newspaper: Nxxxx
        serialNumber += "NEW";
        serialNumber += super.generateSerialNumber();

        return serialNumber;
    }

    @Override
    public String toString() {
        return super.getSerialNumber() + " " + this.headline + " (" + this.publisher + ")";
    }
}
