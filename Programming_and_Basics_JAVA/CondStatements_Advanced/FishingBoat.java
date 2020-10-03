import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fisherman = Integer.parseInt(scanner.nextLine());

        double boatPrice = 0;

        switch (season) {
            case "Spring":
                boatPrice = 3000;
                break;
            case "Summer":
            case "Autumn":
                boatPrice = 4200;
                break;
            case "Winter":
                boatPrice = 2600;
                break;
        }
        if (fisherman <= 6) {
            boatPrice = boatPrice * 0.90;
        } else if (fisherman <= 11) {
            boatPrice = boatPrice * 0.85;
        } else {
            boatPrice = boatPrice * 0.75;
        }
        if (fisherman % 2 == 0 && !season.equals("Autumn")) {
            boatPrice = boatPrice * 0.95;
        }
        if (budget >= boatPrice) {
            double moneyLeft = budget - boatPrice;
            System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
        } else {
            double moneyNeed = boatPrice - budget;
            System.out.printf("Not enough money! You need %.2f leva.", moneyNeed);
        }
    }
}

