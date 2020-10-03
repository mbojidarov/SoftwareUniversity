import java.util.Scanner;

public class ReplaceRepeatedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input =  scanner.nextLine();
        StringBuilder sb = new StringBuilder();

        String baseLetter = String.valueOf(input.charAt(0));
        sb.append(baseLetter);

        for (int i = 1; i < input.length(); i++) {
            String currentSymbol = String.valueOf(input.charAt(i));
            if (!currentSymbol.equals(baseLetter)){
                sb.append(currentSymbol);
                baseLetter = currentSymbol;
            }
        }
        System.out.println(sb);
    }
}
