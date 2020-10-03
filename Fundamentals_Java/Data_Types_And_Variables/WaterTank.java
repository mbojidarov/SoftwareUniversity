import java.util.Scanner;

public class WaterTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int tank = 255;
        for (int i = 0; i < input; i++) {
            int currentLitters = Integer.parseInt(scanner.nextLine());
            if ((tank - currentLitters) < 0){
                System.out.println("Insufficient capacity!");
            } else {
                tank = tank - currentLitters;
            }
        }
        System.out.println(255 - tank);
    }
}
