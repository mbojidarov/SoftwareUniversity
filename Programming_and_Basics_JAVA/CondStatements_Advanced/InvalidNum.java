import java.util.Scanner;

public class InvalidNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNum = Integer.parseInt(scanner.nextLine());

        if (inputNum <= 200 && inputNum >= 100 || inputNum == 0) {

        } else {
            System.out.println("invalid");
        }
    }
}
