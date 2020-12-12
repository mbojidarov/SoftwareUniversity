package onlineShop.models.products.computers;

public class Laptop extends BaseComputer{
    public static final int DEFAULT_PERFORMANCE = 10;
   //•	Laptop – overall performance is 10

    public Laptop(int id, String manufacturer, String model, double price) {
        super(id, manufacturer, model, price, DEFAULT_PERFORMANCE);
        //Child classes should not receive an overall performance as a parameter from the constructor
    }
}
