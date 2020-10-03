import java.util.Scanner;

public class DigitsLettersOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder digitsSB = new StringBuilder();
        StringBuilder lettersSB = new StringBuilder();
        StringBuilder otherSB = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))){
                digitsSB.append(input.charAt(i));

            }else if (Character.isLetter(input.charAt(i))){
                lettersSB.append(input.charAt(i));

            }else{
                otherSB.append(input.charAt(i));
            }
        }
        System.out.println(digitsSB);
        System.out.println(lettersSB);
        System.out.println(otherSB);
    }
}
