public class Human {
    private String name;

    // Scenario #4.1: Create the constructor of the Human - it should only accept a name
    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    
    public void pet(Animal animal) {
        System.out.println(name + " is petting " + animal.getName());
    }
}
