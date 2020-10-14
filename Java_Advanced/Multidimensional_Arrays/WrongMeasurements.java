import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[rows][];

        for (int r = 0; r < rows; r++) {
            matrix[r] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
        }
        int[] parts = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int wrongNumber = matrix[parts[0]][parts[1]];

        List<int[]> indexes = new ArrayList<>();          //pazq vsichki indexes
        List<Integer> correctValues = new ArrayList<>(); // i suotvetnite values

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c] == wrongNumber){
                    indexes.add(new int[] {r, c});
                    correctValues.add(getCorrectValue(matrix, r, c));
                                                //method + nested OutOfBounds method
                }
            }
        }
        for (int i = 0; i < indexes.size(); i++) {
            int[] rowAndCol = indexes.get(i); //vzimam 2-ta indexa za change value v matrix
            matrix[rowAndCol[0]][rowAndCol[1]] = correctValues.get(i);
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static int getCorrectValue(int[][] matrix, int r, int c) {

        int sum = 0;
        int wrongValue = matrix[r][c];

        //isOutOfBounds();

        if (isInBounds(matrix, r - 1, c) && wrongValue != matrix[r -1][c]){   //UP
            sum += matrix[r - 1][c];
        }
        if (isInBounds(matrix, r + 1, c) && wrongValue != matrix[r + 1][c]){  //DOWN
            sum += matrix[r + 1][c];
        }
        if (isInBounds(matrix, r, c - 1) && wrongValue != matrix[r][c - 1]){  //LEFT
            sum += matrix[r][c - 1];
        }
        if (isInBounds(matrix, r, c + 1) && wrongValue != matrix[r][c + 1]){  //RIGHT
            sum += matrix[r][c + 1];
        }

        return sum;
    }

    private static boolean isInBounds(int[][] matrix, int r, int c) {
        return r >= 0 && r < matrix.length && c >= 0 && c < matrix[r].length;
    }

    private static boolean isOutOfBounds(int[][] matrix, int r, int c) {
        return !isInBounds(matrix, r, c);
        //vrushta true kogato methoda isInBounds e greshen (ne e veren)
    }
}
