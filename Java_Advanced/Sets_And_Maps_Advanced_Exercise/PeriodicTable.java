import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeSet<String> elements = new TreeSet<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
           String[] input = scanner.nextLine().split("\\s+");

           elements.addAll(Arrays.asList(input));

//            for (int j = 0; j < input.length; j++) {
//                elements.add(input[j]);
//            }
        }
        System.out.print(String.join(" ", elements));

//        for (String element : elements) {
//            System.out.print(element + " ");
//        }
    }
}
