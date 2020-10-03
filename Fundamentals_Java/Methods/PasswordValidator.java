import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        boolean isPasswordCorrect = isValidPassword(input);
        if (isPasswordCorrect){
            System.out.println("Password is valid");
        }

//        List<String> passsword = Arrays.stream(input.split(""))
//                .collect(Collectors.toList());

    }

    private static boolean isValidPassword(String input) {
        boolean isEnough = password6and10chars(input);
        boolean containsDigitsAndLetters = passwordLettersAndDigits(input);
        boolean isPasword2Digits = passwordAtLeast2Digits(input);
        boolean isValid = isEnough && containsDigitsAndLetters && isPasword2Digits;
        return isValid;
    }

    private static boolean passwordAtLeast2Digits(String input) {

        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                count++;
                if (count == 2) {
                    break;
                }
            }
        }
        if (count == 2) {
            return true;
        } else {
            System.out.println("Password must have at least 2 digits");
            return false;
        }
    }

        private static boolean passwordLettersAndDigits (String input){
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if (!Character.isLetterOrDigit(symbol)){
                System.out.println("Password must consist only of letters and digits");
                return false;
            }
        }
        return true;
                         // NE RABOTI
//            if (input.matches("[0-9]+") && input.matches("\\d+")) {
//                return true;
//            } else {
//                System.out.println("Password must consist only of letters and digits");
//                return false;
//            }
        }

        private static boolean password6and10chars (String input){

            if (input.length() >= 6 && input.length() <= 10) {
                return true;
            } else {
                System.out.println("Password must be between 6 and 10 characters");
                return false;
            }
        }
    }

