import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String originalText = scanner.nextLine();

        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < originalText.length(); i++) {
            char currentSymbol = (char) (originalText.charAt(i) + 3);
            encryptedText.append(currentSymbol);
        }
        System.out.println(encryptedText);


    }
}
