import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzlesTotal = Integer.parseInt(scanner.nextLine());
        int dollsTotal = Integer.parseInt(scanner.nextLine());
        int teddybearsTotal = Integer.parseInt(scanner.nextLine());
        int minionsTotal = Integer.parseInt(scanner.nextLine());
        int trucksTotal = Integer.parseInt(scanner.nextLine());

        double totalToysOrdered =
                puzzlesTotal + dollsTotal + teddybearsTotal + minionsTotal + trucksTotal;
        double totalToysPrice =
                0.9 * (puzzlesTotal * 2.6 + dollsTotal * 3 + teddybearsTotal * 4.1 + minionsTotal * 8.2 + trucksTotal * 2);

        if (totalToysOrdered >= 50) {
            totalToysPrice = totalToysPrice * 0.75;

            if (totalToysPrice >= tripPrice) {
                System.out.printf("Yes! %.2f lv left.", totalToysPrice - tripPrice);

            } else {
                System.out.printf("Not enough money! %.2f lv needed.", tripPrice - totalToysPrice);
            }

        } else {
            if (totalToysPrice >= tripPrice) {
                System.out.printf("Yes! %.2f lv left.", totalToysPrice - tripPrice);
            } else {
                System.out.printf("Not enough money! %.2f lv needed.", tripPrice - totalToysPrice);
            }
        }
    }
}