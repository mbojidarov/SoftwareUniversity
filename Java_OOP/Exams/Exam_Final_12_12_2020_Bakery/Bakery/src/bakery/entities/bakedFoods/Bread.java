package bakery.entities.bakedFoods;

public class Bread extends BaseFood{
    public static final double InitialBreadPortion = 200;

    public Bread(String name, double price) {
        super(name, InitialBreadPortion, price);
    }
}
