import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] firstMatrix = readMatrix(scanner);
        int[][] secondMatrix = readMatrix(scanner);

        boolean areEqual = compareMatrices(firstMatrix, secondMatrix);

                                                              // Ternaren operator
        System.out.println(areEqual ? "equal" : "not equal");
                      // ako e true - purvoto    ako e false - vtoroto
    }

    private static boolean compareMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        //sravnqvam po DALJINATA na REDOVETE na 2-te matrices
        if (firstMatrix.length != secondMatrix.length) {
            return false;
        }
        // sravnqvam po DALJINATA na vseki MASIV ot 2-te matrices
        for (int row = 0; row < firstMatrix.length; row++) {
            int[] arrFirst = firstMatrix[row];
            int[] arrSecond = secondMatrix[row];
            if (arrFirst.length != arrSecond.length) {
                return false;
            }
            //sravnqvam po vseki ELEMENT ot 2-ta masiva
            for (int col = 0; col < arrFirst.length; col++) {
                if (arrFirst[col] != arrSecond[col]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] readMatrix(Scanner scanner) {
        String[] parts = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(parts[0]);
        int cols = Integer.parseInt(parts[1]);

        int[][] matrix = new int[rows][cols];

        // 1. Variant - Stream API
        for (int i = 0; i < rows; i++) {
            int[] arrTokens = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[i] = arrTokens;

            // 2. Variant - 2 ForLoops
//        for (int r = 0; r < rows; r++) {
//            String[] arrTokens2 = scanner.nextLine().split("\\s+");
//            for (int c = 0; c < cols; c++) {
//                firstMatrix[r][c] = Integer.parseInt(arrTokens2[c]);
//            }
//        }
        }
        return matrix;
    }
}
