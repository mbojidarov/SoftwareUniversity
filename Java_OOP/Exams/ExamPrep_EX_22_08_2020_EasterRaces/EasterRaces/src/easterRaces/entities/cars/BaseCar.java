package easterRaces.entities.cars;

import static easterRaces.common.ExceptionMessages.*;

public abstract class BaseCar implements Car{
    private String model;
    private int horsePower;
    private double cubicCentimeters;

    protected BaseCar(String model, int horsePower, double cubicCentimeters) {
        this.setModel(model);
        this.setHorsePower(horsePower);
        this.setCubicCentimeters(cubicCentimeters);
    }

    private void setModel(String model) {
        if (model == null || model.trim().isEmpty() || model.length() < 4){
            throw new IllegalArgumentException(String.format(INVALID_MODEL, model, 4));
        }
        this.model = model;
    }

    private void setHorsePower(int horsePower) {
        if (this.getClass().getSimpleName().equals("Muscle")){
            if (horsePower < 400 || horsePower > 600){
                throw new IllegalArgumentException(String.format(INVALID_HORSE_POWER, horsePower));
            }
        }else if (this.getClass().getSimpleName().equals("Sports")){
            if (horsePower < 250 || horsePower > 450){
                throw new IllegalArgumentException(String.format(INVALID_HORSE_POWER, horsePower));
            }
        }
        this.horsePower = horsePower;
    }

    private void setCubicCentimeters(double cubicCentimeters) {
        this.cubicCentimeters = cubicCentimeters;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public int getHorsePower() {
        return this.horsePower;
    }

    @Override
    public double getCubicCentimeters() {
        return this.cubicCentimeters;
    }

    @Override
    public double calculateRacePoints(int laps) {
        return getCubicCentimeters() / getHorsePower() * laps;
    }
}
