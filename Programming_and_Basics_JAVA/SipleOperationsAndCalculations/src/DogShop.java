import java.util.Scanner;

public class DogShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogsNumber = Integer.parseInt(scanner.nextLine());
        int others = Integer.parseInt(scanner.nextLine());
        double dogfood = dogsNumber * 2.50;
        double othersfood = others * 4;
        double total = dogfood + othersfood;

        System.out.printf("%.2f lv.", total);


    }

}
