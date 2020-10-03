import java.util.Scanner;

public class Vending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalSum = 0;
        String command = scanner.nextLine();
        while (!"Start".equals(command)) {
            double insertCoin = Double.parseDouble(command);
            switch (command) {
                case "0.1":
                case "0.2":
                case "0.5":
                case "1":
                case "2":
                    totalSum = totalSum + insertCoin;
                    break;
                default:
                    System.out.printf("Cannot accept %.2f%n", insertCoin);
            }
            command = scanner.nextLine();
        }
        String product = scanner.nextLine();
        while (!"End".equals(product)) {
            //if (totalSum >= 0.7) {
                switch (product) {
                    case "Nuts":
                        if (totalSum >= 2) {
                            totalSum = totalSum - 2;
                            System.out.printf("Purchased %s%n", product);
                        } else {
                            System.out.println("Sorry, not enough money");
                        }
                        break;
                    case "Water":
                        if (totalSum >= 0.7) {
                            totalSum = totalSum - 0.7;
                            System.out.printf("Purchased %s%n", product);
                        } else {
                            System.out.println("Sorry, not enough money");
                        }
                        break;
                    case "Crisps":
                        if (totalSum >= 1.5) {
                            totalSum = totalSum - 1.5;
                            System.out.printf("Purchased %s%n", product);
                        } else {
                            System.out.println("Sorry, not enough money");
                        }
                        break;
                    case "Soda":
                        if (totalSum >= 0.8) {
                            totalSum = totalSum - 0.8;
                            System.out.printf("Purchased %s%n", product);
                        } else {
                            System.out.println("Sorry, not enough money");
                        }
                        break;
                    case "Coke":
                        if (totalSum >= 1) {
                            totalSum = totalSum - 1;
                            System.out.printf("Purchased %s%n", product);
                        } else {
                            System.out.println("Sorry, not enough money");
                        }
                        break;
                    default:
                        System.out.println("Invalid product");
                }
            //} else {
            //    System.out.println("Sorry, not enough money");
            //}
            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", totalSum);
    }
}
