import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int[] temp = input;
        if (input.length > 0) {

            while (temp.length != 1) {

                int[] condensed = new int[temp.length - 1];

                for (int i = 0; i < condensed.length; i++) {
                    condensed[i] = temp[i] + temp[i + 1];
                }
                temp = condensed;
            }
        } else {
            // is already condensed to number
            System.out.printf("%d", input[0]);
        }
        System.out.println(temp[0]);
    }
}
