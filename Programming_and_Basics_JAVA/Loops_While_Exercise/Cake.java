import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int widthCake = Integer.parseInt(scanner.nextLine());
        int lenghtCake = Integer.parseInt(scanner.nextLine());
        int areaCake = widthCake * lenghtCake;
        int totalPieces = 0;

        String input = scanner.nextLine();

        while (!"STOP".equals(input)) {
            int pieces = Integer.parseInt(input);
            totalPieces += pieces;
            if (totalPieces > areaCake) {
                break;
            }
            input = scanner.nextLine();
        }
        int needCake = Math.abs(totalPieces - areaCake);
        if (totalPieces <= areaCake) {
            System.out.printf("%d pieces are left.", needCake);
        } else {
            System.out.printf("No more cake left! You need %d pieces more.", needCake);
        }
    }
}
