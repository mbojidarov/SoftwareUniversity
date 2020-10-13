import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rowsAndCols = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[rowsAndCols][];

        for (int r = 0; r < matrix.length; r++) {
            int[] parts = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            matrix[r] = parts;
        }
        for (int r = 0; r < matrix.length; r++) {       // UP-Left --> Down-Right
            System.out.print(matrix[r][r] + " ");
        }
        System.out.println();
                                                         // Down-Left --> Up-Right
        for (int col = 0; col < matrix.length; col++) {
            System.out.print(matrix[(matrix.length - 1) - col][col] + " ");
        }
        System.out.println();

//        int row = 0;
//        int col = matrix.length - 1;
                                                        // UP-Right --> Down-Left
//        while (row < matrix.length && col >= 0 ){
//            System.out.print(matrix[row][col] + " ");
//            row++;
//            col--;
//        }
    }
}
