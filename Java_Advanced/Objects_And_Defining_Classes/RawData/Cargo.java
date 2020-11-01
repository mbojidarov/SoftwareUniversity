package RawData;

public class Cargo {
    private int cargoWeight;
    private String cargoType;

    public Cargo(int weight, String type) {
        this.cargoWeight = weight;
        this.cargoType = type;
    }

    public String getType() {
        return this.cargoType;
    }
}

