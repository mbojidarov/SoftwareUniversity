import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < input; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum = sum + number;

            if (number > max) {
                max = number;
            }
        }
        int sumSmalls = sum - max;
        int diff = Math.abs(sumSmalls - max);

        if (sumSmalls == max) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", sumSmalls);

        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", diff);
        }
    }
}


