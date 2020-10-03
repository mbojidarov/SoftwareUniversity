import java.util.Scanner;

public class GreaterNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chislo1 = Integer.parseInt(scanner.nextLine());
        int chislo2 = Integer.parseInt(scanner.nextLine());

        if (chislo1 > chislo2) {
            System.out.println(chislo1);
        } else {
            System.out.println(chislo2);
        }

    }
}
