import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNumber = Double.parseDouble(scanner.nextLine());
        double secondNumber = Double.parseDouble(scanner.nextLine());

        double result = factorialDivision(firstNumber, secondNumber);
        System.out.println(String.format("%.2f", result));

    }

    private static double factorialDivision(double firstNumber, double secondNumber) {
        double firstFactorial = findFactorial(firstNumber);
        double secondFactorial = findFactorial(secondNumber);
        double divisionResult = firstFactorial / secondFactorial;
        return  divisionResult;
    }

    private static double findFactorial(double number) {
        double factorialResult = 1;
        for (int i = 1; i <= number; i++) {
            factorialResult = factorialResult * i;
        }
        return factorialResult;
    }
}
