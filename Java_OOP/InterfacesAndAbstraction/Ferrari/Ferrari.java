package Ferrari;

public class Ferrari implements Car{
    private String model;
    private String driverName;

    public Ferrari(String driverName) {
        this.model = "488-Spider";
        this.driverName = driverName;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String brakes() {
        return "Brakes!";
    }

    @Override
    public String gas() {
        return "brum-brum-brum-brrrrr";
    }

    @Override
    public String toString() {
        return getModel() + "/" + brakes() + "/" + gas() + "/" + getDriverName();
    }
}
