import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        int currentResult = getMultipleOfEvensAndOdds(input);

        System.out.println(currentResult);
    }

    private static int getMultipleOfEvensAndOdds(int num) {
        int evenSum = getEvenSum(num);
        int oddSum = getOddSum(num);

        return evenSum * oddSum;
    }

    private static int getEvenSum(int num) {
        int evenSum = 0;
        while (Math.abs(num) > 0) {
            int current = num % 10;
            if (current % 2 == 0) {
                evenSum = evenSum + current;
            }
            num = num / 10;
        }
        return evenSum;
    }

    private static int getOddSum(int num) {
        int oddSum = 0;
        while (Math.abs(num) > 0) {
            int current = num % 10;
            if (current % 2 != 0) {
                oddSum = oddSum + current;
            }
            num = num / 10;
        }
        return oddSum;
    }
}
