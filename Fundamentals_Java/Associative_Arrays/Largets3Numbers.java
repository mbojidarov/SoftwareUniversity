import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Largets3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numSorted = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(n -> Integer.parseInt(n))
                .sorted((a, b) -> b.compareTo(a))
                .limit(3)
                .collect(Collectors.toList());

//                String numsSorted = Arrays.stream.split.map.sorted
//                .map(n -> n.toString())
//                .collect(Collectors.joining(" "))
//        System.out.println(numsSorted);

        for (Integer num : numSorted) {
            System.out.print(num + " ");
        }
    }
}
