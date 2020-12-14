import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class Garden {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] matrixSize = scanner.nextLine().split("\\s+");
        int size = Integer.parseInt(matrixSize[0]);

        int[][] gardenMatrix = new int[size][size];
        gardenMatrix = fillMatrixWithZeros(gardenMatrix, size);

        List<int[]> plantPositions = new ArrayList<>(); //All plants indexes

        String secondInput = scanner.nextLine();
        while (!"Bloom Bloom Plow".equals(secondInput)){
            String[] plantIndex = secondInput.split("\\s+");
            int plantRow = Integer.parseInt(plantIndex[0]);
            int plantCol = Integer.parseInt(plantIndex[1]);

            if (isOutOfBounds(gardenMatrix, plantRow, plantCol)){
                System.out.println("Invalid coordinates.");
                secondInput = scanner.nextLine();
                continue;
            }else{ //inBounds
                plantPositions.add(new int[]{plantRow, plantCol});
            }
            secondInput = scanner.nextLine();
        }

        //BLOOM BEGINS
        for (int i = 0; i < plantPositions.size(); i++) {
            int[]rowAndCol = plantPositions.get(i);
            int magicRow = rowAndCol[0];
            int magicCol = rowAndCol[1];
            for (int c = 0; c < size; c++) {  //row bloom
                gardenMatrix[magicRow][c] += 1;
            }
            for (int r = 0; r < size; r++) {    // col bloom
                gardenMatrix[r][magicCol] += 1;
            }
            gardenMatrix[magicRow][magicCol] -= 1;
        }

        printGardenMatrix(gardenMatrix, size);
    }
    private static boolean isInBounds(int[][] matrix, int r, int c) {
        return r >= 0 && r < matrix.length && c >= 0 && c < matrix[r].length;
    }

    private static boolean isOutOfBounds(int[][] matrix, int r, int c) {
        return !isInBounds(matrix, r, c);
        //vrushta true kogato methoda isInBounds e greshen (ne e veren)
    }

    private static void printGardenMatrix(int[][] gardenMatrix, int size) {
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                System.out.print(gardenMatrix[r][c] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] fillMatrixWithZeros(int[][] gardenMatrix, int size) {
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                gardenMatrix[r][c] = 0;
            }
        }
        return gardenMatrix;
    }
}
