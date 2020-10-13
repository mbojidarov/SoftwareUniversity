import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class MaximumSumOf2X2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputSize = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt).toArray();
        int rows = inputSize[0];
        int cols = inputSize[1];

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt).toArray();
        }

        int maxSum = Integer.MIN_VALUE;
        int[][] outputMatrix = new int[2][2];

        for (int r = 0; r < rows - 1; r++) {
            for (int c = 0; c < cols - 1; c++) {
                int cuurentSum = matrix[r][c] + matrix[r][c + 1]
                        + matrix[r + 1][c] + matrix[r + 1][c + 1];
                if (cuurentSum > maxSum){
                    maxSum = cuurentSum;
                    outputMatrix[0][0] = matrix[r][c];
                    outputMatrix[0][1] = matrix[r][c + 1];
                    outputMatrix[1][0] = matrix[r + 1][c];
                    outputMatrix[1][1] = matrix[r + 1][c + 1];
                }
            }
        }
        for (int r = 0; r < 2; r++) {
            for (int c = 0; c < 2; c++) {
                System.out.print(outputMatrix[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println(maxSum);
    }
}
