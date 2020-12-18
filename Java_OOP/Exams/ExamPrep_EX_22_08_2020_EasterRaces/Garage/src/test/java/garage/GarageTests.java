package garage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GarageTests {
    //TODO: Test Garage class
    private Garage garage;
    private Car car;


    @Before
    public void setUp(){
        this.garage = new Garage();


    }

    @Test(expected = UnsupportedOperationException.class)
    public void test_UNMODIFIABLE(){
        Car car1 = new Car("toyo", 100, 5000);

        garage.getCars().add(car1);
    }

    @Test
    public void test_COUNT(){
        Car car1 = new Car("toyo", 100, 5000);
        Car car2 = new Car("trabi", 150, 7000);
        Car car3 = new Car("lada", 200, 9000);

        garage.addCar(car1);
        garage.addCar(car2);
        garage.addCar(car3);

        Assert.assertEquals(3, this.garage.getCount());
    }

    @Test
    public void test_MAXSPEED_filterLIST(){
        Car car1 = new Car("toyo", 100, 5000);
        Car car2 = new Car("trabi", 150, 7000);
        Car car3 = new Car("lada", 200, 9000);
        garage.addCar(car1);
        garage.addCar(car2);
        garage.addCar(car3);
        // 1.
        List<Car> cars = List.of(car2, car3);
        Assert.assertEquals(cars, garage.findAllCarsWithMaxSpeedAbove(100));
        // 2.
        List<Car> garageList = this.garage.findAllCarsWithMaxSpeedAbove(100);
        Assert.assertEquals(cars.size(), garageList.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_ADD_CarNULL(){
        car = null;
        garage.addCar(car);
    }

    @Test
    public void test_ADD_VALID_Car(){
        car = new Car("toyo", 100, 5000);
        garage.addCar(car);

        Assert.assertEquals(1, garage.getCount());
    }

    @Test
    public void testMOST_EXPENSIVE_Car_filter(){
        Car car1 = new Car("toyo", 100, 5000);
        Car car2 = new Car("trabi", 150, 7000);
        Car car3 = new Car("lada", 200, 9000);
        garage.addCar(car1);
        garage.addCar(car2);
        garage.addCar(car3);

        Assert.assertEquals(car3, garage.getTheMostExpensiveCar());
    }

    @Test
    public void test_FIND_CARS_BY_BRAND(){
        Car car1 = new Car("toyo", 100, 5000);
        Car car2 = new Car("lada", 150, 7000);
        Car car3 = new Car("lada", 200, 9000);
        garage.addCar(car1);
        garage.addCar(car2);
        garage.addCar(car3);

        List<Car> cars = List.of(car2, car3);
        Assert.assertEquals(cars, garage.findAllCarsByBrand("lada"));
    }
}