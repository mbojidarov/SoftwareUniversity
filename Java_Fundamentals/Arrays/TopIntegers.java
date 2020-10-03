import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.stream;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String[] input = scanner.nextLine().split(" ");
//        int[] numbers = new int[input.length];
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = Integer.parseInt(input[i]);
//        }

        int[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        for (int i = 0 ; i < input.length - 1; i++) {
            int topInteger = input[i];
            boolean isTop = false;
            for (int j = i + 1; j < input.length ; j++) {

                if (input[i] > input[j]){
                    topInteger = input[i];
                    isTop = true;
                }else {
                    break;
                }
                if (isTop == true && j == input.length - 1){
                    System.out.print(topInteger + " ");
                }
            }
        }
        System.out.println(input[input.length - 1]);
    }
}
