package VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Car> cars = new ArrayList<>();
        List<Truck> trucks = new ArrayList<>();

        int carsTotalHP = 0;
        int trucksTotalHP = 0;

        String input = scanner.nextLine();

        while (!"End".equals(input)){
            String[] parts = input.split("\\s+");
            String type = parts[0];
            String model = parts[1];
            String color = parts[2];
            int horsePower = Integer.parseInt(parts[3]);

            if ("car".equals(type)){
                Car car = new Car(model, color, horsePower);
                cars.add(car);
                carsTotalHP = carsTotalHP + car.getHorsePower();
            }else if("truck".equals(type)){
                Truck truck = new Truck(model, color, horsePower);
                trucks.add(truck);
                trucksTotalHP = trucksTotalHP + truck.getHorsePower();
            }
            input = scanner.nextLine();
        }
        String secondInput = scanner.nextLine();
        while (!"Close the Catalogue".equals(secondInput)){
            for (Car car : cars) {
                if (car.getModel().equals(secondInput)){
                    System.out.println(car);
                    break;
                }
            }
            for (Truck truck : trucks) {
                if (truck.getModel().equals(secondInput)){
                    System.out.println(truck);
                    break;
                }
            }

            secondInput = scanner.nextLine();
        }
        double avgCarsTotalHP = 0;
        if (cars.size() != 0){
            avgCarsTotalHP = carsTotalHP * 1.0 / cars.size();
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n", avgCarsTotalHP);

        double avgTrucksTotalHP = 0;
        if (trucks.size() != 0){
            avgTrucksTotalHP = trucksTotalHP * 1.0 / trucks.size();
        }
        System.out.printf("Trucks have average horsepower of: %.2f.", avgTrucksTotalHP);
    }
}
