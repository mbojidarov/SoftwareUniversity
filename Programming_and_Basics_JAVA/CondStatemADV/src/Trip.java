import java.util.Scanner;

public class Trip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String place = "";
        String destination = "";

        if (budget <= 100){
            destination = "Bulgaria";
            switch (season){
                case "summer":
                    place = "Camp";
                    budget = budget * 0.3;
                    break;
                case "winter":
                    place = "Hotel";
                    budget = budget * 0.7;
                    break;
            }
        }else if (budget <= 1000){
            destination = "Balkans";
            switch (season) {
                case "summer":
                    place = "Camp";
                    budget = budget * 0.4;
                    break;
                case "winter":
                    place = "Hotel";
                    budget = budget * 0.8;
                    break;
            }
        }else {
            destination = "Europe";
            place = "Hotel";
            budget = budget * 0.9;
        }
        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", place, budget);
    }
}
