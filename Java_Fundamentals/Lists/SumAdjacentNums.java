import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumAdjacentNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        List<Double> numbers = new ArrayList<>();
        for (String part : input) {
            double currentNum = Double.parseDouble(part);

            numbers.add(currentNum);
        }

        for (int i = 0; i < numbers.size() - 1; i++) {
            double currentNum = numbers.get(i);
            double nextNum = numbers.get(i + 1);

            if (currentNum == nextNum) {
                numbers.set(i, currentNum + nextNum);
                numbers.remove(i + 1);
                i = - 1; // za da zapochvame vinagi otnachaloto
            }
        }
        for (Double number : numbers) {
            System.out.print(new DecimalFormat("0.#" + " ").format(number));
        }
    }
}
