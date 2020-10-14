import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[size][size];

        readMatrix(matrix, size, scanner);
        int primarySum = findPrimaryDiagonalSum(matrix, size);
        int secondarySum = findSecondaryDiagonalSum(matrix, size);
        int totalSum = Math.abs(primarySum - secondarySum);
        System.out.println(totalSum);
    }

    private static int findSecondaryDiagonalSum(int[][] matrix, int size) {

        int sum = 0;

//        for (int col = 0; col < size; col++) {
//            sum += matrix[(size - 1) - col][col];
//        }
        int row = matrix.length - 1;
        int col = 0;                             // Down-Left --> UP-Right diagonal
        while (row >= 0 && col <= matrix.length - 1){
            sum += matrix[row][col];
            row--;
            col++;
        }
        return sum;
    }

    private static int findPrimaryDiagonalSum(int[][] matrix, int size) {

        int sum = 0;
        for (int i = 0; i < size; i++) {         // UP-Left --> Down-Right diagonal
            sum += matrix[i][i];
        }
        return sum;
    }

    private static int [][] readMatrix(int[][] matrix, int size, Scanner scanner) {

        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();

        }
        return matrix;
    }
}
