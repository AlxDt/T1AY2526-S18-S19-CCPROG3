import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Principle of ENCAPSULATION
        // Not everything should be visible to anything
        // Not everything should be CHANGABLE by everyone

        // ...but how do we create an animal?
        // TADA
        // We have created an Animal object that is a zebra
        // This is the part where we created an animal
        Animal zebra = new Animal(1.6, "Black and white");

        // This is the part where we print the values of the animal (which we assigned)
        System.out.println("Name: " + zebra.getName());
        System.out.println("Color: " + zebra.getColor());
        System.out.println("Height: " + zebra.getHeight());

        // This is the part where we assigned some values for the animal
        zebra.setName("Marty"); // Accesses the the field of an object THROUGH a method

        zebra.eat("adobo");

        System.out.println("=============");

        // Let's create a zoo
        // Blue eagle
        // Scenario #1: Create an eagle that is blue
        Animal blueEagle = new Animal(2, "Blue");

        // Scenario #2: Print out the color of the eagle
        System.out.println("Eagle color: " + blueEagle.getColor());

        // Lion
        Animal lion = new Animal(1.4, "Brown");

        // Capybara
        Animal capybara = new Animal(0.5, "Brown");

        // Tiger
        Animal tiger = new Animal(2, "Brown & Black");

        // Scenario #3: Let's name our lion Lolo
        lion.setName("Lolo");

        System.out.println("Lion name: " + lion.getName());

        // Scenario #4: Let's have our capybara be owned by a human named Kaka
        // 1. Create the human
        Human kaka = new Human("Kaka");

        // 2. Have the capybara be owned by the human we just created
        capybara.setName("Joseph Escobar II");
        capybara.setOwner(kaka);

        System.out.println("The owner of " + capybara.getName() + " is " + capybara.getOwner().getName());

        scanner.close();
    }
}