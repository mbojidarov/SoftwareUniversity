import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashSet<String> parking = new LinkedHashSet<>();

        while (!"END".equals(input)) {
            String direction = input.split(",\\s+")[0];
            String plateID = input.split(",\\s+")[1];

            if ("IN".equals(direction)) {
                parking.add(plateID);

            } else if ("OUT".equals(direction)) {
                parking.remove(plateID);
            }
            input = scanner.nextLine();
        }
        if (!parking.isEmpty()) {
            System.out.println(String.join(System.lineSeparator(), parking));
//            for (String car : parking) {
//                System.out.println(car);
//            }
        } else {
            System.out.println("Parking Lot is Empty");
        }
    }

}
