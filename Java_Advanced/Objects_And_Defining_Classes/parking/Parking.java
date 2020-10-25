package parking;

import java.util.ArrayList;
import java.util.List;

public class Parking {
    private String type;
    private int capacity;
    List<Car> data;

    public Parking(String type, int capacity){
        this.type = type;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }
    public void add(Car car) {
     if (this.data.size() < this.capacity){
         this.data.add(car);
     }
    }

    public boolean remove(String manufacturer, String model) {
        for (Car car : data) {
            if (car.getManufacturer().equals(manufacturer)
            && car.getModel().equals(model)){
                this.data.remove(car);
                return true;
            }
        }
        return false;
    }

    public Car getLatestCar() {
      Car result = null;

        for (Car car : data) {
            if (result == null || result.getYear() < car.getYear()){
                result = car;
            }
        }
        return result;
    }

    public Car getCar(String manufacturer, String model) {
        for (Car car : data) {
            if (car.getManufacturer().equals(manufacturer)
                    && car.getModel().equals(model)){
                this.data.remove(car);
                return car;
            }
        }
        return null;
    }

    public int getCount() {
        return this.data.size();
    }

    public String getStatistics() {
        StringBuilder output = new StringBuilder();
        output.append(String.format("The cars are parked in %s%n:", this.type));

        for (Car car : data) {
            output.append(car.toString()).append(System.lineSeparator());
        }
        return output.toString().trim();
    }
}
