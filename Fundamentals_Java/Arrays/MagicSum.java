import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        int magicSum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numbers.length; i++) {
            int firstNum = numbers[i];

            for (int j = i + 1; j < numbers.length; j++) {
                int secondNum = numbers[j];
                if ((firstNum + secondNum) == magicSum){
                    System.out.println(firstNum + " " + secondNum);
                }
            }
        }
    }
}
