package VehiclesExtended;

public class Bus extends Vehicle{
    private static final double PEOPLE_ADDITIONAL_CONSUMPTION = 1.4;

    protected Bus(double fuelQuantity, double consumption, int tankCapacity) {
        super(fuelQuantity, consumption, tankCapacity);
    }

    public String driveWithPeople(double distance){
        return super.driveWithAddConsumption(PEOPLE_ADDITIONAL_CONSUMPTION,
                () -> super.drive(distance));
    }

//    public String driveWithPeople(double distance){
//       String output = super.drive(distance);
//       return output;
//    }
}
