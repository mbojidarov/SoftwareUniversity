import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stackNumbers = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String[] commands = scanner.nextLine().split("\\s+");

            if ("1".equals(commands[0])){
                stackNumbers.push(Integer.parseInt(commands[1]));
            }else if ("2".equals(commands[0])){
                stackNumbers.pop();
            }else{  // "3"
                System.out.println(findMaxElement(stackNumbers));
//                Collections.max(stackNumbers);
//                stackNumbers.stream().mapToInt(e->e).max().getAsInt();
            }
        }
    }

    private static int findMaxElement(ArrayDeque<Integer> stackNumbers) {
        int maxNum = Integer.MIN_VALUE;
        for (Integer number : stackNumbers) {
            if (number > maxNum){
                maxNum = number;
            }
        }
        return maxNum;
    }
}
