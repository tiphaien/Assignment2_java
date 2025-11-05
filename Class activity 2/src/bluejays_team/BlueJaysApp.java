package bluejays_team;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// Entry point for package 1
public class BlueJaysApp {
    public static void main(String[] args) {
        try {
            Player.teamMotto();
            System.out.println("\n=== Toronto Blue Jays Player Demo ===\n");

            // Create players
            Player p1 = new Player("Bo Bichette", 26, "Shortstop");
            Pitcher p2 = new Pitcher("Kevin Gausman", 33, "Pitcher", 3.18, 154);
            Batter p3 = new Batter("Vladimir Guerrero Jr.", 25, "First Baseman", 35, 0.284);
            Batter p4 = new Batter("Alejandro Kirk", 26, "Catcher", 8, 0.252);

            // Display individual players
            p1.displayInfo(); p1.train(); System.out.println();
            p2.displayInfo(); p2.train(); p2.showPitcherStats(); System.out.println();
            p3.displayInfo(); p3.train(); p3.showBatterStats(); System.out.println();
            p4.displayInfo(); p4.train(); p4.showBatterStats(); System.out.println();

            // Polymorphism demo
            System.out.println("\n=== Team Overview (Polymorphism Demo) ===");
            Player[] team = {p1, p2, p3, p4};
            for (Player player : team) {
                player.train();
            }

            // === Save all player info to file ===
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("players.txt"))) {
                writer.write("=== Toronto Blue Jays Players ===");
                writer.newLine();
                for (Player player : team) {
                    writer.write("Name: " + player.getName() + " | Age: " + player.age + " | Position: " + player.position);

                    if (player instanceof Pitcher) {
                        Pitcher p = (Pitcher) player;
                        writer.write(" | ERA: " + p.getEra() + " | Pitch Speed: " + p.getSpeed() + " km/h");
                    } else if (player instanceof Batter) {
                        Batter b = (Batter) player;
                        writer.write(" | Home Runs: " + b.getHomeRuns() + " | Batting Average: " + b.getBattingAverage());
                    }

                    writer.newLine();
                }
                System.out.println("\nPlayer stats saved to players_stats.txt successfully!");
            } catch (IOException e) {
                System.out.println("Error writing to file: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
