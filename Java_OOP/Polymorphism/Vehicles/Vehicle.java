package Vehicles;

import java.text.DecimalFormat;

public abstract class Vehicle {
    private double fuelQuantity;
    private double consumption;

    protected Vehicle(double fuelQuantity, double consumption) {
        this.setFuelQuantity(fuelQuantity);
        this.setConsumption(consumption);
    }

    protected double getFuelQuantity() {
        return fuelQuantity;
    }

    protected void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    protected double getConsumption() {
        return consumption;
    }

    protected void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    protected String drive(double distance)  {
        double needFuel = distance * this.consumption;
      if (needFuel > fuelQuantity){
          return this.getClass().getSimpleName() + " needs refueling";
      }
      fuelQuantity -= needFuel;
        return this.getClass().getSimpleName() + " travelled " +
                new DecimalFormat("#.##").format(distance) + " km";
    }

    protected void refuel(double liters){
        this.fuelQuantity += liters;
    }

    @Override
    public String toString() {
        return String.format(this.getClass().getSimpleName() + ": %.2f", this.fuelQuantity);
    }
}
