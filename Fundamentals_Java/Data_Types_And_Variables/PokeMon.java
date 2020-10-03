import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int powerN = Integer.parseInt(scanner.nextLine());
        int distanceM = Integer.parseInt(scanner.nextLine());
        int exhaustionY = Integer.parseInt(scanner.nextLine());

        int count = 0;
        int exhaustFactor = powerN / 2;
        while (powerN >= distanceM){
            powerN = powerN - distanceM;
            count++;
            if (powerN == exhaustFactor && exhaustionY != 0){
                powerN = powerN / exhaustionY;
            }
        }
        System.out.println(powerN);
        System.out.println(count);
    }
}
