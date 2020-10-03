import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputOne =  scanner.nextLine().split(" ");
        String[] inputTwo =  scanner.nextLine().split(" ");

        int minLength = Math.min(inputOne.length, inputTwo.length);
        int maxLength = minLength + Math.abs(inputOne.length - inputTwo.length);

        for (int i = 0; i < minLength; i++) {
            System.out.print(inputOne[i] + " ");
            System.out.print(inputTwo[i] + " ");
        }
        for (int i = minLength; i < maxLength; i++) {
            if (inputOne.length > minLength){
                System.out.print(inputOne[i] + " ");
            }
            if (inputTwo.length > minLength){
                System.out.print(inputTwo[i] + " ");
            }
        }
    }
}
