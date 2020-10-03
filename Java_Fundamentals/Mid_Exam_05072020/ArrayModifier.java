import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Long> elements = Arrays.stream(input.split("\\s+"))
                .map(Long::parseLong).collect(Collectors.toList());

        String secondInput = scanner.nextLine();

        while (!"end".equals(secondInput)) {
            String[] orders = secondInput.split("\\s+");
            String command = orders[0];

            switch (command) {
                case "swap":
                    int index1 = Integer.parseInt(orders[1]);
                    int index2 = Integer.parseInt(orders[2]);
                    long temp = elements.get(index2);
                    elements.set(index2, elements.get(index1));
                    elements.set(index1, temp);
                    break;
                case "multiply":
                   // long tempM = elements.get(index1);
                    int indexOne = Integer.parseInt(orders[1]);
                    int indexTwo = Integer.parseInt(orders[2]);
                    long multiplyResult = elements.get(indexOne) * elements.get(indexTwo);
                    elements.set(indexOne, multiplyResult);
                    break;
                case "decrease":
                    for (int i = 0; i < elements.size(); i++) {
                        long decreaseResult = elements.get(i) - 1;
                        elements.set(i, decreaseResult);
                    }
                    break;
            }
            secondInput = scanner.nextLine();
        }
//        for (Long element : elements) {
//            System.out.print(element + ", ");
//        }
        System.out.println(elements.toString()
                .replaceAll("[\\[\\]]", ""));
    }
}
