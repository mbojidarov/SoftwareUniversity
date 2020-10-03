import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] text = scanner.nextLine().split("\\s+");
        String result = "";

        StringBuilder result2 = new StringBuilder();
        for (String word : text) {
            for (int i = 0; i < word.length(); i++) {
                result2.append(word);
            }
        }
        // 2. variant - STREAM
//        String textStreamResult = Arrays.stream(text)
//                .map(w -> { for (int i = 0; i < w.length(); i++) {
//                            result += w;
//                    }
//                    return result;
//                }).collect(Collectors.joining());
// -----------------------------------------------------
        // 3. variant - FOR Loop
//        for (String word : text) {
//            for (int i = 0; i < word.length(); i++) {
//                result = result + word;
//            }
//        }
        System.out.println(result2);
    }
}
