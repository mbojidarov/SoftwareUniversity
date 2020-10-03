import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] banedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String word : banedWords) {
            List<String> stars = new ArrayList<>();
            for (int i = 0; i < word.length(); i++) {
                stars.add("*");
            }
            String result = String.join("", stars);
            text = text.replace(word, result);
        }
        System.out.println(text);
    }
}
