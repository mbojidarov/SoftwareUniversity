import java.util.Scanner;

public class OperationsBetweenNum {
    public static void main(String[] arghs) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        int result = 0;
        String evenOdd = "";
        //Събиране(+), Изваждане(-), Умножение(*), Деление(/) и Модулно деление(%).
        switch (operator) {
            case "+":
                result = n1 + n2;
                if (result % 2 == 0) {
                    evenOdd = "even";
                } else {
                    evenOdd = "odd";
                }
                System.out.printf("%d %s %d = %d - %s", n1, operator, n2, result, evenOdd);
                break;
            case "-":
                result = n1 - n2;
                if (result % 2 == 0) {
                    evenOdd = "even";
                } else {
                    evenOdd = "odd";
                }
                System.out.printf("%d %s %d = %d - %s", n1, operator, n2, result, evenOdd);
                break;
            case "*":
                result = n1 * n2;
                if (result % 2 == 0) {
                    evenOdd = "even";
                } else {
                    evenOdd = "odd";
                }
                System.out.printf("%d %s %d = %d - %s", n1, operator, n2, result, evenOdd);
                break;
            case "/":
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    double n3 = n1;
                    double n4 = n2;
                    double resultDouble = n3 / n4;
                    System.out.printf("%d %s %d = %.2f", n1, operator, n2, resultDouble);
                    //result = n1 / n2;
                    //System.out.printf("%d %s %d = %.2f", n1, operator, n2, result);
                }
                break;
            case "%":
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    result = n1 % n2;
                    if (result == 0) {
                        evenOdd = "even";
                    } else {
                        evenOdd = "odd";
                        System.out.printf("%d %s %d = %d", n1, operator, n2, result);
                        break;
                    }
                }
        }
    }
}
