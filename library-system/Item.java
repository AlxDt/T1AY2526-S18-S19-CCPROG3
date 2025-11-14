import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public abstract class Item {
    private String serialNumber;
    private LocalDate published;
    private LocalDate lastBorrowed;

    public Item(LocalDate published) {
        this.serialNumber = generateSerialNumber();
        this.published = published;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public LocalDate getPublished() {
        return published;
    }

    public LocalDate getLastBorrowed() {
        return lastBorrowed;
    }

    public void setLastBorrowed(LocalDate lastBorrowed) {
        this.lastBorrowed = lastBorrowed;
    }

    protected String generateSerialNumber() {
        String serialNumber = "";

        ArrayList<Integer> takenNumbers = new ArrayList<>();

        // 6 digits
        for (int digit = 1; digit <= 6; digit++) {
            // append a string 0 to 9 to the existing serial number
            // but do not repeat the numbers

            int chosenNumber;

            do {
                chosenNumber = new Random().nextInt(10);
            } while (takenNumbers.contains(chosenNumber));
            
            serialNumber += chosenNumber;

            takenNumbers.add(chosenNumber);
        }

        return serialNumber;
    }
}
