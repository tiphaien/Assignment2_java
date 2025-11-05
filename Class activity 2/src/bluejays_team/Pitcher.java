package bluejays_team;

// Subclass demonstrating inheritance and method overriding
public class Pitcher extends Player {
    private double era; // earned run average
    private int speed;  // pitching speed in km/h

    // Default constructor
    public Pitcher() {
        super();
        this.era = 0.0;
        this.speed = 0;
    }

    // Custom constructor
    public Pitcher(String name, int age, String position, double era, int speed) {
        super(name, age, position);
        this.era = era;
        this.speed = speed;
    }

    // Overriding the train() method
    @Override
    public void train() {
        System.out.println(getName() + " is improving pitching accuracy and speed.");
    }

    // Display extra information
    public void showPitcherStats() {
        System.out.println("ERA: " + era + " | Pitch Speed: " + speed + " km/h");
    }
}
