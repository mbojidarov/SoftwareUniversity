import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int rotation = Integer.parseInt(input.split("[()]")[1]) % 360;

        input = scanner.nextLine();
        ArrayList<String> words = new ArrayList<>();
        int maxWordsLenght = 0;

        while (!"END".equals(input)) {
            words.add(input);
            if (input.length() > maxWordsLenght) {
                maxWordsLenght = input.length();
            }
            input = scanner.nextLine();
        }
        int rows = words.size();
        int cols = maxWordsLenght;
        char[][] baseMatrix = new char[rows][cols];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {

                if (words.get(r).length() > c) {      //dobavqm char
                    baseMatrix[r][c] = words.get(r).charAt(c);
                } else {                             //ako e prazna kletkata (null)
                    baseMatrix[r][c] = ' ';
                }
            }
        }
        matrixRotationDegree(rotation, rows, cols, baseMatrix);
    }

    private static void matrixRotationDegree(int rotation, int rows, int cols, char[][] baseMatrix) {
        switch (rotation){
            case 0 :                                  //no rotation at 0 degrees
                for (int r = 0; r < rows; r++) {
                    for (int c = 0; c < cols; c++) {
                        System.out.print(baseMatrix[r][c]);
                    }
                    System.out.println();
                }
                break;
            case 90:                                    //rotation at 90 degrees
                for (int c = 0; c < cols; c++) {
                    for (int r = rows - 1; r >= 0; r--) {
                        System.out.print(baseMatrix[r][c]);
                    }
                    System.out.println();
                }
                break;
            case 180:                                   //rotation at 180 degrees
                for (int r = rows - 1; r >= 0; r--) {
                    for (int c = cols - 1; c >= 0; c--) {
                        System.out.print(baseMatrix[r][c]);
                    }
                    System.out.println();
                }
                break;
            case 270:                                   //rotation at 270 degrees
                for (int c = cols - 1; c >= 0; c--) {
                    for (int r = 0; r < rows; r++) {
                        System.out.print(baseMatrix[r][c]);
                    }
                    System.out.println();
                }
                break;
        }
    }
}
