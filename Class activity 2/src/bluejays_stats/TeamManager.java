package bluejays_stats;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TeamManager implements TeamOperations {
    private String teamName;
    private int totalWins;
    private int totalLosses;

    public void displayTeamStats() {
        System.out.println("Team: " + teamName);
        System.out.println("Wins: " + totalWins);
        System.out.println("Losses: " + totalLosses);
        System.out.printf("Winning Percentage: %.2f%%\n", getWinningPercentage());}

    public void displayTeamStats() {
        System.out.println("Team: " + teamName + " | Wins: " + totalWins + " | Losses: " + totalLosses);
    }

    public void saveStatsToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("=== Blue Jays Season Stats ===");
            writer.newLine();
            writer.write("Team: " + teamName);
            writer.newLine();
            writer.write("Wins: " + totalWins);
            writer.newLine();
            writer.write("Losses: " + totalLosses);
            writer.newLine();
            writer.write("Winning Percentage: " + getWinningPercentage());
            System.out.println("Stats saved successfully to " + filename);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    private double getWinningPercentage() {
        int totalGames = totalWins + totalLosses;
        return totalGames==0 ? 0.0 : (double) totalWins / totalGames * 100;
    }
}

