import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
  //      String[]temp = input.split("'");



        List<Integer> elements = Arrays.stream(input.split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        double averageValue = 0;
        int sum = 0;

        for (int i = 0; i < elements.size(); i++) {
            int currentElement = elements.get(i);
            sum = sum + currentElement;
            averageValue = (sum * 1.0) / elements.size();
        }

        Collections.sort(elements);

        int count = 1;
        for (int i = elements.size() - 1; i >= 0; i--) {
            if ((elements.get(i) > averageValue) && count <= 5) {
            count++;
                System.out.print(elements.get(i) + " ");
            }
        }
        if (count == 1){
            System.out.println("No");
        }
    }
}
