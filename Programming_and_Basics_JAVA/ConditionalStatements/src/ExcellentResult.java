import java.util.Scanner;

public class ExcellentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            double otsenka = Double.parseDouble(scanner.nextLine());

            if (otsenka >= 5.50) {
                System.out.println("Excellent!");
            }

    }
}
