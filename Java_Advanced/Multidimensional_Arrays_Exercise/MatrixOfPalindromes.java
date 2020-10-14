import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        String [][] matrix = new String[rows][cols];

        char startLetter = 'a';

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                int current = startLetter + c;
                                          //   matrix[r][c] = (char) (current);
            matrix[r][c] = "" + startLetter + (char) (current) + startLetter;
            }
            startLetter ++;
        }
        printMatrix(matrix, rows, cols);
    }

    private static void printMatrix(String[][] matrix, int rows, int cols) {

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }
}
