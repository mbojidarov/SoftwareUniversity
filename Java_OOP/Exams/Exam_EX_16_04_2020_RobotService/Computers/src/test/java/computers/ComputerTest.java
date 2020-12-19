package computers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComputerTest {

    //TODO: TEST ALL THE FUNCTIONALITY OF THE PROVIDED CLASS Computer

    private Computer computer;
    private Part part;

    @Before
    public void setUP() {
        computer = new Computer("HP");
        part = new Part("RAM", 40);
    }

    @Test
    public void test_CONSTRUCTOR_VALID(){
        computer = new Computer("IBM");

        Assert.assertNotNull(computer);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_CONSTRUCTOR_NULL_value(){
        computer = new Computer(null);

    }

    @Test(expected = UnsupportedOperationException.class)
    public void test_UNMODIFIABLE() {
        computer.getParts().add(part);
    }

    @Test
    public void test_GET_TOTAL_PRICE_LIST() {
        Part part1 = new Part("HDD", 150);
        Part part2 = new Part("CASE", 10.50);
        computer.addPart(part);
        computer.addPart(part1);
        computer.addPart(part2);

        Assert.assertEquals(200.50, computer.getTotalPrice(), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_ADD_when_NULL(){
        part = null;
        computer.addPart(part);
    }

    @Test
    public void test_ADD_with_VALID_VALUE(){
        computer.addPart(part);

        Assert.assertEquals("RAM", this.computer.getParts().get(0).getName());

        Assert.assertEquals(1, computer.getParts().size());
    }

    @Test
    public void test_REMOVE(){
        computer.removePart(part);
        Assert.assertEquals(0, computer.getParts().size());
    }

    @Test
    public void test_RETURN_REMOVED_VALUE(){
        computer.addPart(part);

        Assert.assertTrue(computer.removePart(part));

    }


    @Test
    public void test_GET_PART(){
        computer.addPart(part);
        computer.addPart(new Part("Power", 50));

        Assert.assertEquals(part, computer.getPart("RAM"));
    }

    @Test
    public void test_GET_NAME(){
        computer.addPart(part);
        computer.addPart(new Part("Power", 50));

        Assert.assertEquals("HP", computer.getName());
    }

}