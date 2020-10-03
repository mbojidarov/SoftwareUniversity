import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int moneyNeed = Integer.parseInt(scanner.nextLine());
        int colectedCash = 0;
        int colectedCard = 0;
        int colectedTotal = 0;
        int transCashCounter = 0;
        int transCardCounter = 0;
        int count = 0;
        boolean isColected = false;

        String input = scanner.nextLine();
        while (!"End".equals(input)) {
            int curentMoney = Integer.parseInt(input);

            count++;
            if (!(count % 2 == 0)) {
                if (curentMoney <= 100) { // Cash
                    colectedCash = colectedCash + curentMoney;
                    System.out.println("Product sold!");
                    transCashCounter++;
                } else {
                    System.out.println("Error in transaction!");
                }
            } else {
                if (curentMoney < 10) { // Credit Card
                    System.out.println("Error in transaction!");
                } else {
                    colectedCard = colectedCard + curentMoney;
                    System.out.println("Product sold!");
                    transCardCounter++;
                }
            }
            colectedTotal = colectedCash + colectedCard;
            if (colectedTotal >= moneyNeed) {
                isColected = true;
                break;
            }
            input = scanner.nextLine();
        }
        double avgCash = colectedCash * 1.0 / transCashCounter;
        double avgCard = colectedCard * 1.0 / transCardCounter;
        if (isColected) {
            System.out.printf("Average CS: %.2f%n", avgCash);
            System.out.printf("Average CC: %.2f%n", avgCard);
        } else {
            System.out.println("Failed to collect required money for charity.");
        }

    }
}
