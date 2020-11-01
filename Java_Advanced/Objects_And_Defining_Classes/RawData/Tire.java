package RawData;

import java.util.HashSet;

public class Tire {
    private int age;
    private double pressure;
//    private HashSet<Tire> tiresPress;

public Tire(double pressure){
    this.pressure = pressure;
}

    public double getPressure() {
        return this.pressure;
    }
}

