import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String input = scanner.nextLine();

        printMidleCharacters(input);
    }

    private static void printMidleCharacters(String input) {
        String [] symbols = input.split("");
        if (symbols.length % 2 == 0){
            int firsIndex = symbols.length / 2 - 1;
            int secondIndex = symbols.length / 2;
            System.out.printf("%s%s", symbols[firsIndex], symbols[secondIndex]);
        }else{
            System.out.println(symbols[symbols.length/2]);
        }
    }
}
