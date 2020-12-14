package bakery.entities.bakedFoods;

import bakery.entities.bakedFoods.interfaces.BakedFood;

public abstract class BaseFood implements BakedFood {
    private String name;
    private double portion;
    private double price;

    protected BaseFood(String name, double portion, double price) {
        this.setName(name);
        this.setPortion(portion);
        this.setPrice(price);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPortion(double portion) {
        this.portion = portion;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPortion() {
        return this.portion;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
