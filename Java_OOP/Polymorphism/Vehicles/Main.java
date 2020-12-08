package Vehicles;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Vehicle> vehiclesMap = new LinkedHashMap<>();

        String[] input1 = scanner.nextLine().split("\\s+");
        String[] input2 = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());

        vehiclesMap.put("Car", new Car(Double.parseDouble(input1[1]),
                Double.parseDouble(input1[2])));
        vehiclesMap.put("Truck", new Truck(Double.parseDouble(input2[1]),
                Double.parseDouble(input2[2])));

        for (int i = 0; i < n; i++) {
            String[] parts = scanner.nextLine().split("\\s+");
           double value = Double.parseDouble(parts[2]);

           if ("Drive".equals(parts[0])){
               System.out.println(vehiclesMap.get(parts[1]).drive(value));

           }else if ("Refuel".equals(parts[0])){
               vehiclesMap.get(parts[1]).refuel(value);
           }
        }

        for (Vehicle vehicle : vehiclesMap.values()) {
            System.out.println(vehicle.toString());
        }
    }
}
