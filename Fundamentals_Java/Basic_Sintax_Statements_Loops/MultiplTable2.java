import java.util.Scanner;

public class MultiplTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int multiplication = Integer.parseInt(scanner.nextLine());

        do {
            System.out.printf("%d X %d = %d%n",
                    number, multiplication, number * multiplication);
            multiplication++;
        } while (multiplication <= 10);
    }
}
