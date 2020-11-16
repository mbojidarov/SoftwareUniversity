package FootballTeamGenerator;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        this.setName(name);
        this.players = new ArrayList<>();
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty())
            throw new IllegalArgumentException("A name should not be empty.");
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player player) {
        if (this.getName() == null) {
            throw new IllegalArgumentException
                    ("Team " + this.getName() + " does not exist.");
        }
        players.add(player);
    }

    public void removePlayer(String playerName) {
        if (!players.contains(playerName)) {
            throw new IllegalArgumentException
                    ("Player " + playerName + " is not in " + this.getName() + " team.");
        }
        players.remove(playerName);
    }

    public double getRating() {  //team Rating
//        if (this.getName() == null) {
//            throw new IllegalArgumentException
//                    ("Team " + this.getName() + " does not exist.");
//        }
//        double teamRating = 0;
//        for (Player player : players) {
//            teamRating += player.overallSkillLevel();
//        }
//        return teamRating;
        return this.players.stream().mapToDouble(Player::overallSkillLevel).sum();
    }
}
