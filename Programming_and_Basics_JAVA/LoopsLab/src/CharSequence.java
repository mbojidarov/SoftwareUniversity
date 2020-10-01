import java.util.Scanner;

public class CharSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int lenght = input.length();

        for (int i = 0; i < lenght; i++){
            System.out.println(input.charAt(i));

        }
    }
}
