package RawData;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Car> data = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] parts = scanner.nextLine().split("\\s+");
            String model = parts[0];
            int engineSpeed = Integer.parseInt(parts[1]);
            int enginePower = Integer.parseInt(parts[2]);
            int cargoWeight = Integer.parseInt(parts[3]);
            String cargoType = parts[4];
            double presure1 = Double.parseDouble(parts[5]);
            double presure2 = Double.parseDouble(parts[7]);
            double presure3 = Double.parseDouble(parts[9]);
            double presure4 = Double.parseDouble(parts[11]);

            Engine cargoEngine = new Engine(engineSpeed, enginePower);
            Cargo cargo = new Cargo(cargoWeight, cargoType);
            Car cargoCar = new Car(model, cargoEngine, cargo, presure1, presure2, presure3, presure4);
            // Tire tire = HashSet.of(presure1, presure2, presure3, presure4);
            data.add(cargoCar);
        }
        String secondInput = scanner.nextLine();

        if ("fragile".equals(secondInput)) {
            data.stream().filter(cargoCar -> cargoCar.getCargo().getType().equals("fragile"))
                    .forEach(cargoCar -> {
                        for (int i = 0; i < cargoCar.getTyresPressure().length; i++) {
                            if (cargoCar.getTyresPressure()[i].getPressure() < 1) {
                                System.out.println(cargoCar.getModel());
                                break;
                            }
                        }
                    });

        } else { //"flamable"
            data.stream()
                    .filter(cargoCar -> cargoCar.getEngine().getEnginePower() > 250)
                    .filter(cargoCar -> cargoCar.getCargo().getType().equals("flamable"))
                    .forEach(cargoCar -> System.out.println(cargoCar.getModel()));
        }
    }
}
