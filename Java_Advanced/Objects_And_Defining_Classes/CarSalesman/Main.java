package CarSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Engine> engineData = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        Engine engine = null;

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String engineModel = input[0];
            int power = Integer.parseInt(input[1]);
            if (input.length == 2) {
                engine = new Engine(engineModel, power);
            } else if (input.length == 3) {

                try {
                    int displacement = Integer.parseInt(input[2]);
                    engine = new Engine(engineModel, power, displacement);
                } catch (NumberFormatException e) {
                    String efficiency = input[2];
                    engine = new Engine(engineModel, power, efficiency);
                }
            } else if (input.length == 4) {
                int displacement = Integer.parseInt(input[2]);
                String efficiency = input[3];
                engine = new Engine(engineModel, power, displacement, efficiency);
            }
            engineData.add(engine);
        }

        List<Car> carsData = new ArrayList<>();
        n = Integer.parseInt(scanner.nextLine());
        Car car = null;

        for (int i = 0; i < n; i++) {
            String[] secondInput = scanner.nextLine().split("\\s+");
            String carModel = secondInput[0];
            String engineModel = secondInput[1];

            if (secondInput.length == 2) {
                car = new Car(carModel, engineModel);
            } else if (secondInput.length == 3) {

                try {
                    int weight = Integer.parseInt(secondInput[2]);
                    car = new Car(carModel, engineModel, weight);
                } catch (NumberFormatException e) {
                    String color = secondInput[2];
                    car = new Car(carModel, engineModel, color);
                }
            } else if (secondInput.length == 4) {
                int weight = Integer.parseInt(secondInput[2]);
                String color = secondInput[3];
                car = new Car(carModel, engineModel, weight, color);
            }
            carsData.add(car);
        }
        for (Car car1 : carsData) {
            System.out.println(car1.getCarModel() + ":");
            System.out.println(car1.getEngineModel() + ":");
            engineData.forEach(engine1 -> {
                if (engine1.getEngineModel().equals(car1.getEngineModel())) {
                    System.out.println(engine1.toString());
                }
            });
            if (car1.getWeight() == 0){
                System.out.println("Weight: n/a");
            }else{
                System.out.println("Weight: " + car1.getWeight());
            }
            System.out.println("Color: " + car1.getColor());
        }
    }
}
