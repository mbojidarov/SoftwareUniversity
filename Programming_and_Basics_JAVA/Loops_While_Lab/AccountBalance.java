import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int incomeNumbers = Integer.parseInt(scanner.nextLine());
        int count = 0;
        double increase = 0;
        double sum = 0;

        while (count < incomeNumbers) {
            increase = Double.parseDouble(scanner.nextLine());
            count++;
            if (increase <= 0){
                System.out.println("Invalid operation!");
                break;
            }
            sum += increase;
            System.out.printf("Increase: %.2f%n", increase);

        }
        System.out.printf("Total: %.2f", sum);
    }
}
