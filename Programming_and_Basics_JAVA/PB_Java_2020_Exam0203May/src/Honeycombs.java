import java.util.Scanner;

public class Honeycombs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bees = Integer.parseInt(scanner.nextLine());
        int flowers = Integer.parseInt(scanner.nextLine());

        double totalHoney = bees * flowers * 0.21;
        double honeyCombs = Math.floor(totalHoney / 100);
        double leftHoney = totalHoney - honeyCombs * 100;

        System.out.printf("%.0f honeycombs filled.%n", honeyCombs);
        System.out.printf("%.2f grams of honey left.", leftHoney);

    }
}
