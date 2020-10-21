import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char[] chars = scanner.nextLine().toCharArray();

        Map<Character, Integer> symbols = new TreeMap<>();
        for (int i = 0; i < chars.length; i++) {
            char current = chars[i];
            symbols.putIfAbsent(current, 0);
            symbols.put(current, symbols.get(current) + 1);
        }

        for (Map.Entry<Character, Integer> entry : symbols.entrySet()) {
            System.out.printf("%c: %d time/s%n", entry.getKey(), entry.getValue());
        }

//        for (int i = 0; i < input.length(); i++) {
//            char current = input.charAt(i);
//
//            symbols.putIfAbsent(current, 0);
//            symbols.put(current, symbols.get(current) + 1);
//
//        }
    }
}
