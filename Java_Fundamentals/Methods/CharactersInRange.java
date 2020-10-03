import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstSymbol = scanner.nextLine().charAt(0);
        char secondSymbol = scanner.nextLine().charAt(0);

        printCharactersInRange(firstSymbol, secondSymbol);
    }

    private static void printCharactersInRange(char firstSymbol, char secondSymbol) {
        if (firstSymbol < secondSymbol) {
            for (int i = firstSymbol + 1; i < secondSymbol; i++) {
                char symbol = (char) i;             // kastvam ot int v char !!!
                System.out.print(symbol + " ");
            }
        }else{
            for (int i = secondSymbol + 1; i < firstSymbol; i++) {
                char symbol = (char) i;             // kastvam ot int v char !!!
                System.out.print(symbol + " ");
            }
        }
    }
}
