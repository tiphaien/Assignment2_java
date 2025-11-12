package bluejays_stats;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TeamManager implements TeamOperations {
    private String teamName;
    private int totalWins;
    private int totalLosses;

    public TeamManager(String teamName) {
        this.teamName = teamName;
        this.totalWins = 0;
        this.totalLosses = 0;
    }

    public void displayTeamStats() {
        System.out.println("Team: " + teamName);
        System.out.println("Wins: " + totalWins);
        System.out.println("Losses: " + totalLosses);
        System.out.printf("Winning Percentage: %.2f%%\n", getWinningPercentage());
        System.out.println("Let's go Blue Jays !!!");
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
            writer.write(String.format("Winning Percentage: %.2f%%", getWinningPercentage()));
            System.out.println("Stats saved successfully to " + filename);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    private double getWinningPercentage() {
        int totalGames = totalWins + totalLosses;
        return totalGames == 0 ? 0.0 : (double) totalWins / totalGames * 100;
    }

    public void addWin() {
        totalWins++;
    }

    public void addLoss() {
        totalLosses++;
    }

    public void resetStats() {
        totalWins = 0;
        totalLosses = 0;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getTotalWins() {
        return totalWins;
    }

    public int getTotalLosses() {
        return totalLosses;
    }

    public TeamManager(String teamName, int totalWins, int totalLosses) {
        this.teamName = teamName;
        this.totalWins = totalWins;
        this.totalLosses = totalLosses;
    }

    public int getTotalGames() {
        return totalWins + totalLosses;
    }

}
