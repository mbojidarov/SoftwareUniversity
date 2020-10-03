import java.util.Scanner;

public class BakingCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int participants = Integer.parseInt(scanner.nextLine());
        int totalBakery = 0;
        double totalSum = 0;
        for (int i = 1; i <= participants; i++) {
            int cookiesCount = 0;
            int cakesCount = 0;
            int wafflesCount = 0;

            String name = scanner.nextLine();
            String typeSweet = scanner.nextLine();
            while (!"Stop baking!".equals(typeSweet)){
                int numberSweets = Integer.parseInt(scanner.nextLine());
                switch (typeSweet){
                    case "cookies":
                        cookiesCount = cookiesCount + numberSweets;
                        totalSum = totalSum + numberSweets * 1.5;
                        break;
                    case "cakes":
                        cakesCount = cakesCount + numberSweets;
                        totalSum = totalSum + numberSweets * 7.8;
                        break;
                    case "waffles":
                        wafflesCount = wafflesCount + numberSweets;
                        totalSum = totalSum + numberSweets * 2.3;
                        break;
                }
                totalBakery =  totalBakery + numberSweets;
               // totalSum = totalSum + (cookiesCount * 1.5) + (cakesCount * 7.8) + (wafflesCount * 2.3);

                typeSweet = scanner.nextLine();
            }
            System.out.printf("%s baked %d cookies, %d cakes and %d waffles.%n",
                    name, cookiesCount, cakesCount, wafflesCount);
        }
        System.out.printf("All bakery sold: %d%n", totalBakery);
        System.out.printf("Total sum for charity: %.2f lv.", totalSum);
    }
}
