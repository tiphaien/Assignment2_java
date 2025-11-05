package bluejays_team;

// Entry point for package 1
public class BlueJaysApp {
    public static void main(String[] args) {
        try {
            Player.teamMotto(); // Static method call

            Player p1 = new Player("Bo Bichette", 26, "Shortstop");
            Pitcher p2 = new Pitcher("Kevin Gausman", 33, "Pitcher", 3.18, 154);

            p1.displayInfo();
            p1.train();

            System.out.println();

            p2.displayInfo();
            p2.train();
            p2.showPitcherStats();

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
