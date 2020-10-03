import java.util.Scanner;

public class FishJar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lenght = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percentSand = Double.parseDouble(scanner.nextLine());

        double totalFishTank = (lenght * width * height) * 0.001;

        double clearWater = (totalFishTank - (totalFishTank * percentSand) /100);

        System.out.printf("%.3f", clearWater);

    }
}
