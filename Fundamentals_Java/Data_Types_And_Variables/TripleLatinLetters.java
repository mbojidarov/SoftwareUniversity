import java.util.Scanner;

public class TripleLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        for (int i = 97; i < 97 + input; i++) {         // 1-va bukva
            for (int j = 97; j < 97 + input; j++) {     // 2-ra bukva
                for (int k = 97; k < 97 + input; k++) { // 3-ta bukva

                    System.out.printf("%c%c%c%n", i, j, k);
                }
            }
        }
    }
}
