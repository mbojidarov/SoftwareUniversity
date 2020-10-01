import java.util.Scanner;

public class Umnojenie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int mnojitel1 = 1; mnojitel1 <= 10 ; mnojitel1++) {
            for (int mnojitel2 = 1; mnojitel2 <= 10 ; mnojitel2++) {
                int result = mnojitel1 * mnojitel2;
                System.out.printf("%d * %d = %d%n", mnojitel1, mnojitel2, result);
            }
        }
    }
}
