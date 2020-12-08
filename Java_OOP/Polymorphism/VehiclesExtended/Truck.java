package VehiclesExtended;

public class Truck extends Vehicle {
    private static final double SUMMER_ADDITIONAL_CONSUMPTION = 1.6;

    protected Truck(double fuelQuantity, double consumption, int tank) {
        super(fuelQuantity, consumption + SUMMER_ADDITIONAL_CONSUMPTION, tank);
    }

    @Override
    protected void refuel(double liters) {
        super.refuel(liters * 0.95);
    }
}
