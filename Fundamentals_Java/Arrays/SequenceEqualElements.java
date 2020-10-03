import java.util.Scanner;

public class SequenceEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        int maxLength = 1;
        int currentLength = 1;
        int maxElement = 0;

        for (int i = 0; i < input.length - 1; i++) {
            int currentNum = numbers[i];

            if (numbers[i] == numbers[i + 1]) {
                currentLength++;
                //currentNum = numbers[i];

                if (maxLength < currentLength) {
                    maxLength = currentLength;
                    maxElement = currentNum;
                }
            } else {
                currentLength = 1;
            }
        }
        for (int i = 0; i < maxLength; i++) {
            System.out.print(maxElement + " ");

        }
    }
}
