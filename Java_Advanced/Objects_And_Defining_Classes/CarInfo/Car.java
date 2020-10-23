package CarInfo;

public class Car {

    private String brand;
    private String model;
    private int horsePower;

    public String getBrand(){
        return this.brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getModel(){
        return this.model;
    }
    public void setModel(String model){
        this.model = model;
    }

    public int getHorsePower(){
        return this.horsePower;
    }
    public void setHorsePower(int horsePower){
        this.horsePower = horsePower;
    }

    public void increaseHP(int horsePower){ //this.horsepower referira kum poleto: horsePower
        this.horsePower += horsePower;     // a ne kum parametara na metoda: int horsePower!!!
    }

    public String carInfo(){
        return this.toString();
    }
    @Override
    public String toString() {
        return String.format("The car is: %s %s - %d HP.",
                 this.brand, this.model, this.horsePower);
    }
}
