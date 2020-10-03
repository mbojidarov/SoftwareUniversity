import java.util.Scanner;

public class FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stadiumTotal = Integer.parseInt(scanner.nextLine());
        int fansTotal = Integer.parseInt(scanner.nextLine());
        int countA = 0;
        int countB = 0;
        int countV = 0;
        int countG = 0;

        for (int i = 0; i < fansTotal; i++) {
            String sector = scanner.nextLine();
            switch (sector){
                case "A":
                    countA++;
                    break;
                case "B":
                    countB++;
                    break;
                case "V":
                    countV++;
                    break;
                case "G":
                    countG++;
                    break;
            }
        }
        double percentageA = countA * 1.0 / fansTotal * 100;
        double percentageB = countB * 1.0 / fansTotal * 100;
        double percentageV = countV * 1.0 / fansTotal * 100;
        double percentageG = countG * 1.0 / fansTotal * 100;
        double percentageAll = fansTotal * 1.0 / stadiumTotal * 100;
        System.out.printf("%.2f%%%n", percentageA);
        System.out.printf("%.2f%%%n", percentageB);
        System.out.printf("%.2f%%%n", percentageV);
        System.out.printf("%.2f%%%n", percentageG);
        System.out.printf("%.2f%%%n", percentageAll);
    }
}
