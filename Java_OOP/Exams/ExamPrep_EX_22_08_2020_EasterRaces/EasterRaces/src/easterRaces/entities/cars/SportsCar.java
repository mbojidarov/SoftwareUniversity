package easterRaces.entities.cars;

public class SportsCar extends BaseCar{
    private static final double cubicCentimeters = 3000;

    public SportsCar(String model, int horsePower) {
        super(model, horsePower, cubicCentimeters);
    }
}
