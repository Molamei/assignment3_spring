package football.services;

import football.League;
import football.config.FootballProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class FootballService {
    @Autowired
    private League league;

    @Autowired
    private FootballProperties properties;

    public void playMatch() {
        // Simulate a football match here
        Random random = new Random();
        int team1Goals = random.nextInt(6);
        int team2Goals = random.nextInt(6);
        String winner = (team1Goals > team2Goals) ? properties.getTeam1Name() :
                (team2Goals > team1Goals) ? properties.getTeam2Name() : "Draw";

        // Generate goal scorers for each team
        List<String> goalScorersTeam1 = generateGoals(team1Goals, properties.getTeam1Name(),
                properties.getStrikerNameTeam1(), properties.getDefenderNameTeam1(), properties.getGoalkeeperNameTeam1());
        List<String> goalScorersTeam2 = generateGoals(team2Goals, properties.getTeam2Name(),
                properties.getStrikerNameTeam2(), properties.getDefenderNameTeam2(), properties.getGoalkeeperNameTeam2());

        // Print match details
        System.out.println("Match Result:");
        System.out.println("Winner: " + winner);
        System.out.println("Score: " + team1Goals + " - " + team2Goals);
        System.out.println("Goal Scorers:");

        System.out.println(properties.getTeam1Name() + ": " + String.join(", ", goalScorersTeam1));
        System.out.println(properties.getTeam2Name() + ": " + String.join(", ", goalScorersTeam2));
    }

    private List<String> generateGoals(int goals, String teamName, String strikerName, String defenderName, String goalkeeperName) {
        List<String> goalScorers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < goals; i++) {
            int playerChoice = random.nextInt(3);
            String playerName = "";
            switch (playerChoice) {
                case 0:
                    playerName = strikerName;
                    break;
                case 1:
                    playerName = defenderName;
                    break;
                case 2:
                    playerName = goalkeeperName;
                    break;
            }
            goalScorers.add(playerName);
        }
        return goalScorers;
    }
}
