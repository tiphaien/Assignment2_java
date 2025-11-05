package bluejays_team;

// Entry point for package 1
public class BlueJaysApp {
    public static void main(String[] args) {
        try {
            // Static method call
            Player.teamMotto();

            System.out.println("\n=== Toronto Blue Jays Player Demo ===\n");

            // Create a regular player
            Player p1 = new Player("Bo Bichette", 26, "Shortstop");

            // Create a pitcher
            Pitcher p2 = new Pitcher("Kevin Gausman", 33, "Pitcher", 3.18, 154);

            // Create batters
            Batter p3 = new Batter("Vladimir Guerrero Jr.", 25, "First Baseman", 35, 0.284);
            Batter p4 = new Batter("Alejandro Kirk", 26, "Catcher", 8, 0.252);

            // Display individual players and their stats
            p1.displayInfo();
            p1.train();

            System.out.println();

            p2.displayInfo();
            p2.train();
            p2.showPitcherStats();

            System.out.println();

            p3.displayInfo();
            p3.train();
            p3.showBatterStats();

            System.out.println();

            p4.displayInfo();
            p4.train();
            p4.showBatterStats();

            // Team overview section using polymorphism
            System.out.println("\n=== Team Overview (Polymorphism Demo) ===");
            Player[] team = {p1, p2, p3, p4};

            for (Player player : team) {
                player.train(); // Different behavior depending on actual player type
            }

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
