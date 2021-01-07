package blueOrigin;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class SpaceshipTests {
    //TODO: TEST ALL THE FUNCTIONALITY OF THE PROVIDED CLASS Spaceship

    private Spaceship spaceship;
    private Astronaut astronaut1;
    private Astronaut astronaut2;
    private Astronaut astronaut3;

    private Collection<Astronaut> astronautsList;

    @Before
    public void setUp(){
        spaceship = new Spaceship("StarTrek", 1000);

        astronaut1 = new Astronaut("marto", 100);
        astronaut2 = new Astronaut("pesho", 50);
        astronaut3 = new Astronaut("rumen", 70);

        astronautsList = new ArrayList<>();
    }

    @Test
    public void test_CONSTRUCTOR_VALID(){
        spaceship = new Spaceship("StarTrek", 1000);

        Assert.assertNotNull(spaceship);
    }

    @Test(expected = NullPointerException.class)
    public void test_CONSTRUCTOR_NULL_value(){

        spaceship = new Spaceship(null, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_CONSTRUCTOR_INVALID_CAPACITY(){

        spaceship = new Spaceship("black_perl", -5);
    }

    @Test
    public void test_GET_COUNT(){
        spaceship.add(astronaut1);
        spaceship.add(astronaut2);

        Assert.assertEquals(2, spaceship.getCount());
    }

    @Test
    public void test_GET_NAME(){
        Assert.assertEquals("StarTrek", spaceship.getName());
    }

    @Test
    public void test_GET_CAPACITY(){
        Assert.assertEquals(1000, spaceship.getCapacity());
    }

    @Test
    public void test_ADD_VALID_DATA(){
        spaceship.add(astronaut1);
        spaceship.add(astronaut2);
        spaceship.add(astronaut3);

        Assert.assertEquals(3, spaceship.getCount());
    }

    @Test
    public void test_ADD_NULL_DATA(){
        spaceship.add(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_ADD_when_FULL_SHIP(){
        spaceship = new Spaceship("full", 2);
        spaceship.add(astronaut1);
        spaceship.add(astronaut2);
        spaceship.add(astronaut3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_ADD_when_EXIST_ASTRO(){
        spaceship = new Spaceship("full", 2);
        spaceship.add(astronaut1);
        spaceship.add(astronaut1);
    }

    @Test
    public void test_REMOVE_NULL_DATA(){  // hmm... it works
        spaceship.add(astronaut1);
        spaceship.add(astronaut2);

        spaceship.remove(null);
    }

    @Test
    public void test_REMOVE_VALID_DATA(){
        spaceship.add(astronaut1);
        spaceship.add(astronaut2);

//        spaceship.remove(astronaut1.getName());

        Assert.assertTrue(spaceship.remove(astronaut1.getName()));
    }
}

