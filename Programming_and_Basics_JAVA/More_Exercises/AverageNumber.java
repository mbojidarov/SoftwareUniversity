import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        double totalSum = 0;
        for (int i = 1; i <= number ; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            totalSum = totalSum + currentNum;
        }
        double avg = totalSum / number;
        System.out.printf("%.2f", avg);
    }
}
