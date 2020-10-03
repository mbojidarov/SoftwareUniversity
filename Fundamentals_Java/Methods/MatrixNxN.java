import java.util.Scanner;

public class MatrixNxN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        printMatrix(n);
    }

    private static void printMatrix(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
