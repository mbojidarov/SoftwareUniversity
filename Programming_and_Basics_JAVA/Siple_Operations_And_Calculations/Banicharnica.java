import java.util.Scanner;

public class Banicharnica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int bakers = Integer.parseInt(scanner.nextLine());
        int cakes = Integer.parseInt(scanner.nextLine());
        int waffles = Integer.parseInt(scanner.nextLine());
        int pancakes = Integer.parseInt(scanner.nextLine());

        int cakePriceTotal = cakes * 45;
        double wafflesPriceTotal = waffles * 5.80;
        double pancakesPriceTotal = pancakes * 3.20;

        double oneBakerPerDay = cakePriceTotal + wafflesPriceTotal + pancakesPriceTotal;
        double allBakerPerDay = oneBakerPerDay * bakers;

        double totalSumCampaign = allBakerPerDay * days;

        System.out.printf("%.2f", totalSumCampaign - (totalSumCampaign / 8));

    }
}
