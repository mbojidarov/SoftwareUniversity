import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        int [][] matrix = new int[rows][cols];
        readMatrix(matrix, scanner);

  //      int[][] outputMatrix = new int[3][3];

        int startRowIndex = 0;
        int startColIndex = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int r = 0; r < rows - 2; r++) {
            for (int c = 0; c < cols - 2; c++) {
                int currentSum = matrix[r][c] + matrix[r][c + 1] + matrix[r][c + 2]
                        + matrix[r + 1][c] + matrix[r + 1][c + 1] + matrix[r + 1][c + 2]
                        + matrix[r + 2][c] + matrix[r + 2][c + 1] + matrix[r + 2][c + 2];
                if (currentSum > maxSum){
                    maxSum = currentSum;

                    startRowIndex = r;
                    startColIndex = c;

//                    outputMatrix[0][0] = matrix[r][c];
//                    outputMatrix[0][1] = matrix[r][c + 1];
//                    outputMatrix[0][2] = matrix[r][c + 2];
//
//                    outputMatrix[1][0] = matrix[r + 1][c];
//                    outputMatrix[1][1] = matrix[r + 1][c + 1];
//                    outputMatrix[1][2] = matrix[r + 1][c + 2];
//
//                    outputMatrix[2][0] = matrix[r + 2][c];
//                    outputMatrix[2][1] = matrix[r + 2][c + 1];
//                    outputMatrix[2][2] = matrix[r + 2][c + 2];
                }
            }
        }

        System.out.println(String.format("Sum = %d", maxSum));

        for (int r = startRowIndex; r <= startRowIndex + 2; r++) {
            for (int c = startColIndex; c <= startColIndex + 2; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }

//        for (int r = 0; r < 3; r++) {
//            for (int c = 0; c < 3; c++) {
//                System.out.print(outputMatrix[r][c] + " ");
//            }
//            System.out.println();
//        }
    }
    

    private static int[][] readMatrix(int[][] matrix, Scanner scanner) {

        for (int r = 0; r < matrix.length; r++) {
            matrix[r] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
        }
        return matrix;
    }
}
