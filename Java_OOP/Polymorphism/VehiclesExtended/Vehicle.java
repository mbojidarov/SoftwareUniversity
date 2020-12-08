package VehiclesExtended;

import java.text.DecimalFormat;
import java.util.function.Supplier;


public abstract class Vehicle {
    private double fuelQuantity;
    private double consumption;
    private int tankCapacity;

    protected Vehicle(double fuelQuantity, double consumption, int tankCapacity) {
        this.tankCapacity = tankCapacity;
        this.setFuelQuantity(fuelQuantity);
        this.consumption = consumption;
    }

    protected <T> T driveWithAddConsumption(double additionalConsumption, Supplier<T> supplier){
        this.consumption += additionalConsumption;
        try{
            return supplier.get();
        }catch (Throwable ex){
            throw new IllegalStateException(ex);
        }finally {
            this.consumption -= additionalConsumption;
        }
    }

    protected void setFuelQuantity(double fuelQuantity) {
        if (fuelQuantity <= 0){
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        this.fuelQuantity = fuelQuantity;
    }


    protected String drive(double distance)  {
        double needFuel = distance * this.consumption;
      if (needFuel > this.fuelQuantity){
          return this.getClass().getSimpleName() + " needs refueling";
      }
      this.setFuelQuantity(this.fuelQuantity - needFuel);
//        this.fuelQuantity -= needFuel;
        return this.getClass().getSimpleName() + " travelled " +
                new DecimalFormat("#.##").format(distance) + " km";
    }

    protected void refuel(double liters){
        if (liters <= 0){
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        if (this.fuelQuantity + liters > this.tankCapacity){
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        this.fuelQuantity += liters;
    }

    @Override
    public String toString() {
        return String.format(this.getClass().getSimpleName() + ": %.2f", this.fuelQuantity);
    }
}
