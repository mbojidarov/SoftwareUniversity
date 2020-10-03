import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value))
                .toArray();

        for (int i = 0; i < array.length ; i++) {
            if (array[i] % 2 == 0){
                sum = sum + array[i];
            }
        }
        System.out.println(sum);
    }
}
