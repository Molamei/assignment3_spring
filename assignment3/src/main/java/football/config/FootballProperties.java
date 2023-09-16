package football.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "football")
public class FootballProperties {
    private String leagueName;
    private String team1Name;
    private String team2Name;
    private String strikerNameTeam1; // Real player name for Team 1's striker
    private String defenderNameTeam1; // Real player name for Team 1's defender
    private String goalkeeperNameTeam1; // Real player name for Team 1's goalkeeper
    private String strikerNameTeam2; // Real player name for Team 2's striker
    private String defenderNameTeam2; // Real player name for Team 2's defender
    private String goalkeeperNameTeam2; // Real player name for Team 2's goalkeeper
}
