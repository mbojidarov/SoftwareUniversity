import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int primeSum = 0;
        int nonPrimeSum = 0;
        String input = scanner.nextLine();

        while (!"stop".equals(input)) {
            int num = Integer.parseInt(input);

            if (num < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }
            boolean flagNonPrime = false;
            for (int i = 2; i <= num / 2; i++) {

                // condition for nonprime number
                if (num % i == 0) {
                    flagNonPrime = true;
                    break;
                }
            }
            if (!flagNonPrime) {
                primeSum = primeSum + num;
            } else {
                nonPrimeSum = nonPrimeSum + num;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", primeSum);
        System.out.printf("Sum of all non prime numbers is: %d%n", nonPrimeSum);
    }
}