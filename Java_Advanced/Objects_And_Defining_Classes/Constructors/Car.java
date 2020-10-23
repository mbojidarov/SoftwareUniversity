package Constructors;

public class Car {
    private String brand;
    private String model;
    private int horsePower;

    public Car(String brand) {
        this.brand = brand;
        this.model = "unknown"; // Ako ne se vuvede value, ostava tazi kato defoltna
        this.horsePower = -1;   // Ako ne se vuvede value, ostava tazi kato defoltna
    }

    public Car(String brand, int horsePower) {
        this(brand);
        this.horsePower = horsePower;
    }

    public Car(String brand, String model, int horsePower) {
        this(brand, horsePower);
        this.model = model;
    }
//    public Car (){
//
//    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return this.horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String carInfo() {
        return this.toString();
    }

    @Override
    public String toString() {
        return String.format("The car is: %s %s - %d HP.",
                this.brand, this.model, this.horsePower);
    }
}
