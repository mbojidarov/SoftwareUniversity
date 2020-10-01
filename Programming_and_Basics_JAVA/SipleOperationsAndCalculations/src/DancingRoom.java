import java.util.Scanner;

public class DancingRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double lRoom = Double.parseDouble(scanner.nextLine());
        double wRoom = Double.parseDouble(scanner.nextLine());
        double garderob = Double.parseDouble(scanner.nextLine());

        double roomArea = (wRoom*100) * (lRoom*100);
        double garderobArea = (garderob*100) * (garderob*100);
        double benchArea = roomArea / 10;
        double clearRoomarea = roomArea - garderobArea - benchArea;

        double dancerSpace = clearRoomarea / 7040;


        // System.out.println(Math.floor(dancerSpace));
        System.out.printf("%.0f", Math.floor(dancerSpace));

    }
}
