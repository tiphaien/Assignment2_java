package bluejays_team;

// Superclass demonstrating encapsulation and inheritance
public class Player {
    // Properties
    private String name;
    protected int age;
    public String position;

    // Default constructor
    public Player() {
        this.name = "Unknown";
        this.age = 0;
        this.position = "Undefined";
    }

    // Custom constructor
    public Player(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    // Getter and Setter (Encapsulation)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Normal method
    public void displayInfo() {
        System.out.println("Player: " + name + " | Age: " + age + " | Position: " + position);
    }

    // Static method (can be called without an instance)
    public static void teamMotto() {
        System.out.println("Toronto Blue Jays: Always Aim for the Sky!");
    }

    // Method to be overridden
    public void train() {
        System.out.println(name + " is training hard.");
    }
}
