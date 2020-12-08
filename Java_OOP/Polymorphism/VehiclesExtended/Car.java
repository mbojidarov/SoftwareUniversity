package VehiclesExtended;

public class Car extends Vehicle {
    private static final double SUMMER_ADDITIONAL_CONSUMPTION = 0.9;

    protected Car(double fuelQuantity, double consumption, int tank) {
        super(fuelQuantity, consumption + SUMMER_ADDITIONAL_CONSUMPTION, tank);
    }
}
