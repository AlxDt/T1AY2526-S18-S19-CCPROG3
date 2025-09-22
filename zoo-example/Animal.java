public class Animal {
    // Fields/Properties/Instance variables <- instance variables SHOULD BE PRIVATE
    // REMEMBER: THESE ARE NOT INSIDE METHODS

    // Encapsulation: The only one responsible for the state of an object, is the object itself.

    private String color; // Yes, all animals have colors from the start
    private double height; // Yes, all animals have heights from the start
    private String name; // No, all animals don't need names from the start
    private Human owner; // No, all animals don't need owners from the start

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Constructor
    // Is a special method that is used to assign initial values to a newly created object
    public Animal(double height, String color) {
        this.height = height;
        this.color = color;
    }

    // Behavior <- methods
    public void eat(String food) {
        System.out.println("The animal is eating " + food);
    }

    // Getter
    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public double getHeight() {
        return this.height;
    }

    public Human getOwner() {
        return this.owner;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
        // <the field you're setting> = <value>
    }

    // Scenario #4.2: Create a setter for the owner
    public void setOwner(Human owner) {
        this.owner = owner;
    }

        /*
         * THIS IS OUR BLUEPRINT FOR AN ANIMAL
         Animal
         ------
         Properties of an animal - what do animals have?

        - # of legs
        - feet
        - face
        - body
        - organs
        - warm blooded/cold blooded
        - color
        - height
        - weight
        - color

        ------
        Behaviors of an animal - what do animals do?
        - eat
        - sleep
        - run
        - drink
        - fly/swim <-
        */
}