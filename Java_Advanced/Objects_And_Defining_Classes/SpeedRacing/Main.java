package SpeedRacing;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Car> carsData = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] parts = scanner.nextLine().split("\\s+");
            String carModel = parts[0];
            double fuelTotal = Double.parseDouble(parts[1]);
            double consumption = Double.parseDouble(parts[2]);

            Car car = new Car(carModel, fuelTotal, consumption);
            carsData.put(carModel, car);
        }
        String secondInput = scanner.nextLine();
        while (!"End".equals(secondInput)) {
            String currentModel = secondInput.split("\\s+")[1];
            int distanceToDrive = Integer.parseInt(secondInput.split("\\s+")[2]);

            Car carToDrive = carsData.get(currentModel);

            if (!carToDrive.driveCheck(distanceToDrive)) {
                System.out.println("Insufficient fuel for the drive");
            }
            secondInput = scanner.nextLine();
        }
        for (Car car : carsData.values()) {
            System.out.println(car.toString());
        }
    }
}
