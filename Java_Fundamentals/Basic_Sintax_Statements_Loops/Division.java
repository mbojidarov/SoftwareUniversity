import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        boolean isDivined = false;
        int div = 0;

        if (number % 10 == 0) {
            isDivined = true;
            div = 10;
        } else if (number % 7 == 0) {
            isDivined = true;
            div = 7;
        } else if (number % 6 == 0) {
            isDivined = true;
            div = 6;
        } else if (number % 3 == 0) {
            isDivined = true;
            div = 3;
        } else if (number % 2 == 0) {
            isDivined = true;
            div = 2;
        }
        if (!isDivined) {
            System.out.println("Not divisible");
        }else {
            System.out.printf("The number is divisible by %d", div);
        }
    }
}
