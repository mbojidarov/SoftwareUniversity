import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] input = scanner.nextLine().toCharArray();

        Map<Character, Integer> letters = new LinkedHashMap<>();

        for (char letter : input) {
            if (letter == ' '){
                continue;
            }
                letters.putIfAbsent(letter, 0);
                int countLetter = letters.get(letter);
                letters.put(letter, countLetter + 1);
        }
        letters.entrySet().forEach(entry -> System.out.printf("%c -> %d%n",
                entry.getKey(), entry.getValue()));
    }
}
