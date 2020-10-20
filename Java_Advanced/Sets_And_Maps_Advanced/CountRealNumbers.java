import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<Double, Integer> countNums = new LinkedHashMap<>();

        double[] inputNums = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble).toArray();

        for (int i = 0; i < inputNums.length; i++) {
            countNums.putIfAbsent(inputNums[i], 0);
            int newCount = countNums.get(inputNums[i]) + 1;
            countNums.put(inputNums[i], newCount);
        }
//        for (Map.Entry<Double, Integer> entry : countNums.entrySet()) {
//            System.out.printf("%.1f -> %d%n", entry.getKey(), entry.getValue());
//        }
        String output = countNums.entrySet().stream()
                .map(entry -> String.format("%.1f -> %d", entry.getKey(), entry.getValue()))
                .collect(Collectors.joining(System.lineSeparator()));

        System.out.println(output);
    }
}
