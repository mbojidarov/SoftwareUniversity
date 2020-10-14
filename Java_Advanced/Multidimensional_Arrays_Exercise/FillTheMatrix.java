import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(",\\s+");
        int rows = Integer.parseInt(input[0]);

        int[][] matrix = new int[rows][];

        if (input[1].equals("A")){
           matrix = fillMatrixPatternA(matrix, rows);
        }else if (input[1].equals("B")){
           matrix = fillMatrixPatternB(matrix, rows);
        }
        printMatrix(matrix, rows);
    }

    private static void printMatrix(int[][] matrix, int rows) {
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] fillMatrixPatternB(int[][] matrix, int rows) {

        int[][] matrixB = new int[rows][rows];
        int startNum = 1;
        for (int c = 0; c < rows; c++) {
            if (c % 2 == 0){                            // EVEN row
                for (int r = 0; r < rows ; r++) {
                    matrixB[r][c] = startNum++;
                }
            }else{                                     // ODD row
                for (int r = rows - 1; r >= 0; r--) {
                    matrixB[r][c] = startNum++;
                }
            }
        }
        return matrixB;
    }

    private static int [][] fillMatrixPatternA(int[][] matrix, int rows) {

        int [][] matrixA = new int[rows][rows];
        int startNum = 1;
        for (int c = 0; c < rows; c++) {
            for (int r = 0; r < rows; r++) {
                matrixA[r][c] = startNum++;
            }
        }
        return matrixA;
    }
}
