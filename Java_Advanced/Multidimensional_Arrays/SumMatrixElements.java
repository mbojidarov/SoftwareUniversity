import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int rows = Integer.parseInt(input.split(",\\s+")[0]);
        int cols = Integer.parseInt(input.split(",\\s+")[1]);
        int [][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split(",\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            // matrix[i] = partsArr;
        }
        int sum = 0;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                int currentNumber = matrix[row][col];
                sum += currentNumber;
            }
        }
        System.out.println(matrix.length);     // count of rows
        System.out.println(matrix[0].length);  // count of columns
        System.out.println(sum);
    }
}
