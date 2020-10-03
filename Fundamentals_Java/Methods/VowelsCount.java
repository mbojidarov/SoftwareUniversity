import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int countVowels = findVowelsCount(input);
        System.out.println(countVowels);
    }

    private static int findVowelsCount(String input) {
        String[] vowel = input.split("");
        int count = 0;
        for (int i = 0; i < vowel.length; i++) {
            if ("a".equalsIgnoreCase(vowel[i]) ||
                    "e".equalsIgnoreCase(vowel[i]) ||
                    "i".equalsIgnoreCase(vowel[i]) ||
                    "o".equalsIgnoreCase(vowel[i]) ||
                    "u".equalsIgnoreCase(vowel[i])) {
                count++;
            }
        }
        return count;
    }
}
