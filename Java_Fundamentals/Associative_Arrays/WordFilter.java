import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .filter(e -> e.length() % 2 == 0)
                .toArray(String[]::new );

//        List<String> words2 = Arrays.stream(scanner.nextLine()
//                .split("\\s+"))
//                .filter(w -> w.length() % 2 == 0)
//                .collect(Collectors.toList());

//                Arrays.stream(scanner.nextLine()
//                .split("\\s+"))
//                .filter(w -> w.length() % 2 == 0)
//                .forEach(w -> System.out.println(w));

        for (String word : words) {
            System.out.println(word);
        }
    }
}
