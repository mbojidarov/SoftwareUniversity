import java.util.Scanner;

public class Godzilla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statisti = Integer.parseInt(scanner.nextLine());
        double clothsForOne = Double.parseDouble(scanner.nextLine());

        double dekorPrice = budget * 0.1;
        double totalClothsPrice = statisti * clothsForOne;
        double totalCost = 0;
        double needMoney = 0;

        if (statisti < 150) {
            totalCost = dekorPrice + totalClothsPrice;
        } else {
            totalCost = dekorPrice + totalClothsPrice * 0.9;
        }
        if (totalCost > budget) {
            needMoney = totalCost - budget;
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", needMoney);
        } else {
            needMoney = budget - totalCost;
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", needMoney);
        }

    }
}
