package CarSalesman;

public class Car {
    private String carModel;
    private String engineModel;
    private int weight;
    private String color;

    public Car(String carModel, String engineModel) {
        this.carModel = carModel;
        this.engineModel = engineModel;
        this.weight = 0;
        this.color = "n/a";
    }
    public Car(String carModel, String engineModel, int weight) {
       this(carModel, engineModel);
       this.weight = weight;
       this.color = "n/a";
    }
    public Car(String carModel, String engineModel, String color) {
        this(carModel, engineModel);
        this.weight = 0;
        this.color = color;
    }
    public Car(String carModel, String engineModel, int weight, String color) {
        this(carModel, engineModel);
        this.weight = weight;
        this.color = color;
    }
    public String getCarModel(){
        return this.carModel;
    }
    public  String getEngineModel(){
        return this.engineModel;
    }

    public int getWeight() {
        return this.weight;
    }
    public String getColor(){
        return this.color;
    }
}
