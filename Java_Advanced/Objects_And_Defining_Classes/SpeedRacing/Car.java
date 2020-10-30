package SpeedRacing;

public class Car {
    private String model;
    private double fuelTotalAmount;
    private double fuelPerKM;
    private int distanceTraveled;

    public Car(String model, double fuelTotalAmount, double fuelPerKM) {
        this.model = model;
        this.fuelTotalAmount = fuelTotalAmount;
        this.fuelPerKM = fuelPerKM;
        this.distanceTraveled = 0;
    }

    public boolean driveCheck(double distanceToDrive) {
        double neededFuel = distanceToDrive * fuelPerKM;
        if (neededFuel <= fuelTotalAmount) {
            fuelTotalAmount -= neededFuel;
            distanceTraveled += distanceToDrive;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d",
                this.model, this.fuelTotalAmount, this.distanceTraveled);
    }
}
