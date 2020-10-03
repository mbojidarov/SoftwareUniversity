import java.util.Scanner;

public class Alcohol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double wiskeyPrice = Double.parseDouble(scanner.nextLine());
        double beerLiters = Double.parseDouble(scanner.nextLine());
        double wineLiters = Double.parseDouble(scanner.nextLine());
        double rakiaLiters = Double.parseDouble(scanner.nextLine());
        double wiskeyLiters = Double.parseDouble(scanner.nextLine());

        double rakiaPrice = wiskeyPrice * 0.5;
        double winePrice = rakiaPrice * 0.6;
        double beerPrice = rakiaPrice * 0.2;


        double total = (wiskeyPrice*wiskeyLiters) + (winePrice*wineLiters) +
                (beerPrice*beerLiters) + (rakiaPrice*rakiaLiters);

        System.out.printf("%.2f", total);
    }

}
