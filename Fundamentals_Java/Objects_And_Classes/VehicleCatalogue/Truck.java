package VehicleCatalogue;

public class Truck {
    private String type;
    private String model;
    private String color;
    private int horsePower;

    public Truck(String model, String color, int horsePower) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.type = "Truck";
    }

    public String getModel() {
        return this.model;
    }

    public int getHorsePower() {
        return this.horsePower;
    }

    @Override
    public String toString() {
        return String.format("Type: %s%n" +
                "Model: %s%n" +
                "Color: %s%n" +
                "Horsepower: %d",
                this.type, this.model, this.color, this.horsePower);
    }
}
