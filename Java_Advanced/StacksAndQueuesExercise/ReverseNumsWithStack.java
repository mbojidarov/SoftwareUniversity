import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;


public class ReverseNumsWithStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

            int[] nums = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();

           // Arrays.stream(scanner.nextLine().split("\\s+")).forEach(numbers::push);

        for (int num : nums) {
            numbers.push(num);
        }

        while (!numbers.isEmpty()){
            System.out.print(numbers.pop() + " ");
        }
    }
}
