import java.util.Arrays;
import java.util.Scanner;

public class NumsReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      int input = Integer.parseInt(scanner.nextLine());

      int [] arr = new int[input];
        for (int i = 0; i < input; i++) {
            arr [i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = input - 1; i >= 0 ; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
