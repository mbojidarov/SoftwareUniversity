package RawData;

import java.util.HashSet;
import java.util.Set;

public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private Tire[] tyresPressure;

    public Car(String model, Engine engine, Cargo cargo, double press1, double press2, double press3, double press4) {
    this.model = model;
    this.engine = engine;
    this.cargo = cargo;
    this.tyresPressure = new Tire[4];
    this.tyresPressure[0] = new Tire(press1);
    this.tyresPressure[1] = new Tire(press2);
    this.tyresPressure[2] = new Tire(press3);
    this.tyresPressure[3] = new Tire(press4);
    }

    public String getModel(){
        return this.model;
    }
    public Engine getEngine(){
        return  this.engine;
    }
    public Cargo getCargo(){
        return this.cargo;
    }
    public Tire[] getTyresPressure(){
        return this.tyresPressure;
    }
}