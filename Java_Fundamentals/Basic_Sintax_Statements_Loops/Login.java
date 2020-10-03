import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";

        for (int i = username.length() - 1; i >= 0; i--) { // obrushtane na string
            password = password + username.charAt(i);
        }
        int count = 0;
        for (int i = 0; i < 4; i++) {
            String input = scanner.nextLine();
            if (password.equals(input)){
                System.out.printf("User %s logged in.", username);
                break;
            }else{
                count++;
                if (count == 4){
                    System.out.printf("User %s blocked!", username);
                    break;
                }
                System.out.println("Incorrect password. Try again.");
            }
        }
    }
}
