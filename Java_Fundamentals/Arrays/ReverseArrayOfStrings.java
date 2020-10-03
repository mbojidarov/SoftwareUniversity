import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] elements = scanner.nextLine().split(" ");

        // 0 -> elements.length - 1
        // 1 -> elements.length - 2
        // 2 -> elements.length - 3

        for (int i = 0; i < elements.length / 2; i++) {
            String temp = elements [i];
            elements[i] = elements[elements.length - i -1];
            elements[elements.length -i -1] = temp;
        }
        System.out.println(String.join(" ", elements));
    }
}