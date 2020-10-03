import java.util.Scanner;

public class PalindromeNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!"END".equals(input)){
            int number = Integer.parseInt(input);

            if (ifIsPalindrome(number)){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
            input = scanner.nextLine();
        }
    }

    private static boolean ifIsPalindrome(int number) {
        int originalNumber = number;
        int palindrome =  0;
        while (number > 0) {
            int digit = number % 10;
            palindrome = palindrome * 10 + digit;
            number = number / 10;
        }
        boolean result = originalNumber == palindrome;
        return result;
    }
}
