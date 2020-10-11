import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int rows = Integer.parseInt(input.split("\\s+")[0]);
        int cols = Integer.parseInt(input.split("\\s+")[1]);
        int [][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
           // matrix[i] = partsArr;
        }
        int numberToFind = Integer.parseInt(scanner.nextLine());
//                                           boolean isFound = false;

        ArrayList<int[]> indexes = new ArrayList<>();  //List ot masivi

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {

                if (matrix[row][col] == numberToFind){
//                                         System.out.println(row + " " + col);
//                                         isFound = true;
                    indexes.add(new int[]{row, col});  //pazim 2-ta indexa
                }
            }
        }
//                                          if (!isFound){
//                                           System.out.println("not found");
//                                           }

        if (indexes.isEmpty()){
            System.out.println("not found");
        }else{
            for (int[] index : indexes) {
                System.out.println(index[0] + " " + index[1]);
            }
        }
    }
}
