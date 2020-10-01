import java.util.Scanner;

public class GreenGrass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grassKvm = Double.parseDouble(scanner.nextLine());
        double totalFull = grassKvm * 7.61;
        double totalDiscount = totalFull * 0.18;
        double finalPrice = totalFull - totalDiscount;

        System.out.printf("The final price is: %.2f lv. %n", finalPrice);
        System.out.printf("The discount is: %.2f lv. %n", totalDiscount);

    }

}
