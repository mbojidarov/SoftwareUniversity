import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(",\\s+");

        boolean checkUser = false;

        for (String currentUsername : input) {
            if (currentUsername.length() >= 3 && currentUsername.length() <= 16) {
                for (int j = 0; j < currentUsername.length(); j++) {
                    char symbol = currentUsername.charAt(j);
                    if (Character.isLetterOrDigit(symbol) || symbol == '-' || symbol == '_') {
                        checkUser = true;
                    } else {
                        checkUser = false;
                        break;
                    }
                }
            }else{
                checkUser = false;
            }
            if (checkUser) {
                System.out.println(currentUsername);
            }
        }
    }
}
