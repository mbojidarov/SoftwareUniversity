package FootballTeamGenerator;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Team> allTeams = new LinkedHashMap<>();

        String[] parts = scanner.nextLine().split(";");

        while (!"END".equals(parts[0])) {
            switch (parts[0]) {
                case "Team":
                    try {
                        Team team = new Team(parts[1]);
                        allTeams.put(parts[1], team);
                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case "Add":
                    try {
                        if (allTeams.containsKey(parts[1])){
                            Player player = new Player(parts[2],
                                    Integer.parseInt(parts[3]),
                                    Integer.parseInt(parts[4]),
                                    Integer.parseInt(parts[5]),
                                    Integer.parseInt(parts[6]),
                                    Integer.parseInt(parts[7]));

                            allTeams.get(parts[1]).addPlayer(player);
                        }else{
                            throw new IllegalArgumentException("Team "+ parts[1] +" does not exist.");
                        }
                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case "Remove":
                    try {
                        if (allTeams.containsKey(parts[1])){
                            allTeams.get(parts[1]).removePlayer(parts[2]);
                        }else{
                            throw new IllegalArgumentException("Team "+ parts[1] +" does not exist.");
                        }
                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case "Rating":
                    if (allTeams.containsKey(parts[1])){
                        System.out.println(String.format("%s - %.0f", parts[1], allTeams.get(parts[1]).getRating()));
                    }
                    break;
            }
            parts = scanner.nextLine().split(";");
        }
    }
}
