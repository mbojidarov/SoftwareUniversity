import java.util.Scanner;

public class CruiseGames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String playerName = scanner.nextLine();
        int numberGames = Integer.parseInt(scanner.nextLine());

        double score = 0;
        int voleyCount = 0;
        int tenisCount = 0;
        int badmCount = 0;
        double voleyScore = 0;
        double tenisScore = 0;
        double badmScore = 0;

        for (int i = 1; i <= numberGames; i++) {
            String game = scanner.nextLine();
            int currentScore = Integer.parseInt(scanner.nextLine());
            switch (game){
                case "volleyball":
                    score = currentScore * 1.07;
                    voleyScore = voleyScore + score;
                    voleyCount++;
                    break;
                case "tennis":
                    score = currentScore * 1.05;
                    tenisScore = tenisScore + score;
                    tenisCount++;
                    break;
                case "badminton":
                    score = currentScore * 1.02;
                    badmScore = badmScore + score;
                    badmCount++;
                    break;
            }
        }
        double avgVoleyScore = voleyScore / voleyCount;
        double avgTenisScore = tenisScore / tenisCount;
        double avgBadmScore = badmScore / badmCount;
        double totalpoints = voleyScore + tenisScore + badmScore;
        if (avgBadmScore >= 75 && avgTenisScore >= 75 && avgVoleyScore >= 75){
            System.out.printf("Congratulations, %s! You won the cruise games with %.0f points.", playerName, Math.floor(totalpoints));
        }else{
            System.out.printf("Sorry, %s, you lost. Your points are only %.0f.", playerName, Math.floor(totalpoints));
        }
    }
}
