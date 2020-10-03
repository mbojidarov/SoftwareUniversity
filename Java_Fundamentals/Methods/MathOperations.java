import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        int secondNum = Integer.parseInt(scanner.nextLine());

        double result = calculateResult(firstNum, operator, secondNum);
        System.out.printf("%.0f", result);
    }

    private static double calculateResult(int firstNum, char operator, int secondNum) {
        double result = 0.0;
        switch (operator){
            case '/':
                result = firstNum / secondNum;
                break;
            case '*':
                result = firstNum * secondNum;
                break;
            case '+':
                result = firstNum + secondNum;
                break;
            case '-':
                result = firstNum - secondNum;
                break;
        }
        return result;
    }
}
