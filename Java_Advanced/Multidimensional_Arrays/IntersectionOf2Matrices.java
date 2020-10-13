import java.util.Scanner;

public class IntersectionOf2Matrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        // method za CHAR matrix!
        char[][] firstMatrix = readCharMatrix(scanner, rows, cols);
        char[][] secondMatrix = readCharMatrix(scanner, rows, cols);

        char[][] outputMatrix = new char[rows][cols];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (firstMatrix[r][c] != secondMatrix[r][c]){
                    outputMatrix[r][c] = '*';
                }else{
                    outputMatrix[r][c] = firstMatrix[r][c];
                }
            }
        }
        // PRINT Matrix
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (firstMatrix[r][c] != secondMatrix[r][c]){
                    outputMatrix[r][c] = '*';
                }else{
                    outputMatrix[r][c] = firstMatrix[r][c];
                }
                System.out.print(outputMatrix[r][c] + " ");
            }
            System.out.println();
        }
    }

    public static char[][] readCharMatrix(Scanner scanner, int rows, int cols){
        char[][] matrix = new char[rows][cols];

        for (int r = 0; r < rows; r++) {
            String[] symbols = scanner.nextLine().split("\\s+");
//             String input = scanner.nextLine();
//             char[] symbols2 = input.replaceAll("\\s+", "").toCharArray();
//             matrix[r] = symbols2;
            for (int c = 0; c < cols; c++) {
                matrix[r][c] = symbols[c].charAt(0);
            }
        }
        return matrix;

//                    2. VARIANT
//        for (int r = 0; r < rows; r++)
//            String input = scanner.nextLine();
//            char[] symbols2 = input.replaceAll("\\s+", "").toCharArray();
//            matrix[r] = symbols2;

    }
}
