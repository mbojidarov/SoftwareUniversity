import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String[] input = scanner.nextLine().split(" ");
//        int[] elements = new int[input.length];
//        for (int i = 0; i < input.length; i++) {
//            elements[i] = Integer.parseInt(input[i]);
//        }

        int[] elements = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value)).toArray();

        boolean isEqual = false;
        for (int i = 0; i < elements.length; i++) {

            int leftSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum = leftSum + elements[j];
            }

            int rightSum = 0;
            for (int k = i + 1; k < elements.length; k++) {
                rightSum = rightSum + elements[k];

            }
            if (leftSum == rightSum) {
                isEqual = true;
                System.out.println(i);
                break;
            }
        }
        if (!isEqual){
            System.out.println("no");
        }
    }
}
