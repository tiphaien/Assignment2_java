package bluejays_stats;

public class StatsApp {
    public static void main(String[] args) {
        try {
            System.out.println("Blue Jays Stats App");

            TeamManager tm=new TeamManager("Toronto Blue Jays", 89, 73);
            tm.displayTeamStats();

            tm.saveStatsToFile("bluejays_stats.txt");
            
            System.out.println("Total Games: " + tm.getTotalGames());

        } catch (Exception e) {
            System.err.println("Error in StatsApp: " + e.getMessage());
            e.printStackTrace();
        }
    }
}


