import java.time.LocalDate;
import java.util.Random;

public class DVD extends Item {
    private String title;
    private double size;

    public DVD(LocalDate published, String title, double size) {
        super(published);
        this.title = title;
        this.size = size;
    }

    public String getTitle() {
        return title;
    }

    public double getSize() {
        return size;
    }
    
    @Override
    public String generateSerialNumber() {
        String serialNumber = "";

        // Newspaper: Nxxxx
        serialNumber += "DVD";
        serialNumber += super.generateSerialNumber();

        return serialNumber;
    }

    @Override
    public String toString() {
        return super.getSerialNumber() + " " + this.title + " (" + this.size + "gb)";
    }
}

