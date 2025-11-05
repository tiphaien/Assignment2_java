package bluejays_team;

// Subclass representing a batter (extends Player)
public class Batter extends Player {
    private int homeRuns;
    private double battingAverage;

    // Default constructor
    public Batter() {
        super();
        this.homeRuns = 0;
        this.battingAverage = 0.0;
    }

    // Custom constructor
    public Batter(String name, int age, String position, int homeRuns, double battingAverage) {
        super(name, age, position);
        this.homeRuns = homeRuns;
        this.battingAverage = battingAverage;
    }

    // Overriding the train() method (Polymorphism)
    @Override
    public void train() {
        System.out.println(getName() + " is practicing batting and improving swing timing.");
    }

    // Display batter-specific stats
    public void showBatterStats() {
        System.out.println("Home Runs: " + homeRuns + " | Batting Average: " + battingAverage);
    }

    public int getHomeRuns() {
        return homeRuns;
    }

    public double getBattingAverage() {
        return battingAverage;
    }

}
