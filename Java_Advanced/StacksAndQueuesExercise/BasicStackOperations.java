import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int numToPush = input[0];
        int numToPop = input[1];
        int numTofind = input[2];

        ArrayDeque<Integer> stackNums = new ArrayDeque<>();

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        for (int number : numbers) {  // for (int i = 0; i < numToPush; i++)
                                       //      stackNums.push(numbers[i])
            stackNums.push(number);
        }
        for (int i = 0; i < numToPop; i++) {
            stackNums.pop();
        }

        if (stackNums.isEmpty()) {
            System.out.println(0);

        } else {
            if (stackNums.contains(numTofind)) {
                System.out.println("true");

            } else {
                //  System.out.println(Collections.min(stackNums));  // 1 variant stream

                //   System.out.println(stackNums.stream().mapToInt(e->e).min().getAsInt());
                //                                                             .orElse(0); - nqma nujda ot validaciq
                System.out.println(findMinNumber(stackNums));     // 3 variant- method
            }
        }
    }

    private static int findMinNumber(ArrayDeque<Integer> stackNums) {
        int minNumber = Integer.MAX_VALUE;
        for (Integer number : stackNums) {
            if (number < minNumber) {
                minNumber = number;
            }
        }
        return minNumber;
    }

}
