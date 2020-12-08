package VehiclesExtended;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Vehicle> vehiclesMap = new LinkedHashMap<>();

        vehiclesMap.put("Car", createVehicle(scanner.nextLine().split("\\s+")));
        vehiclesMap.put("Truck", createVehicle(scanner.nextLine().split("\\s+")));
        
        Bus bus = createBus(scanner.nextLine().split("\\s+"));
        vehiclesMap.put("Bus", bus);
        
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] parts = scanner.nextLine().split("\\s+");
           double value = Double.parseDouble(parts[2]);       //liters or distance

           if ("Drive".equals(parts[0]) && "Bus".equals(parts[1])){
               System.out.println(bus.driveWithPeople(value));

           }else if ("Drive".equals(parts[0])){
               System.out.println(vehiclesMap.get(parts[1]).drive(value));

           }else if ("Refuel".equals(parts[0])){
               try{
                   vehiclesMap.get(parts[1]).refuel(value);
               }catch (IllegalArgumentException ex){
                   System.out.println(ex.getMessage());
               }
           }
        }

        for (Vehicle vehicle : vehiclesMap.values()) {
            System.out.println(vehicle.toString());
        }
    }

    private static Bus createBus(String[] input) {
        return new Bus(Double.parseDouble(input[1]),
                Double.parseDouble(input[2]), Integer.parseInt(input[3]));
    }

    private static Vehicle createVehicle(String[] input) {
        switch (input[0]){
            case "Car":
                return new Car(Double.parseDouble(input[1]),
                Double.parseDouble(input[2]), Integer.parseInt(input[3]));
            case "Truck":
                return new Truck(Double.parseDouble(input[1]),
                        Double.parseDouble(input[2]), Integer.parseInt(input[3]));
            case "Bus":
                return createBus(input);
            default:
                throw new IllegalArgumentException("Unknow Vehicle TYPE!!!");
        }
    }
}
