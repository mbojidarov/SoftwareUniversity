import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int numA = Integer.parseInt(scanner.nextLine());
        int numB = Integer.parseInt(scanner.nextLine());

        switch (input) {
            case "add":
                add(numA, numB);
                break;
            case "multiply":
                multiply(numA, numB);
                break;
            case "subtract":
                substract(numA, numB);
                break;
            case "divide":
                divide(numA, numB);
                break;

        }
    }

    private static void divide(int a, int b) {
        System.out.println(a / b);
    }

    private static void substract(int a, int b) {
        System.out.println(a - b);
    }

    private static void multiply(int a, int b) {
        System.out.println(a * b);
    }

    private static void add(int a, int b) {
        System.out.println(a + b);
    }

}
