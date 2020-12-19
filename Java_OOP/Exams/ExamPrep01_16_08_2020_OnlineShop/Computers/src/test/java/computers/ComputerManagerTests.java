package computers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.swing.plaf.ComponentUI;
import java.util.ArrayList;
import java.util.List;

public class ComputerManagerTests {
    // TODO: Test ComputerManager
    private Computer computer1;
    private Computer computer2;
    private Computer computer3;
    List<Computer> computers;
    ComputerManager computerManager;

    @Before
    public void setUP() {
        computerManager = new ComputerManager();
        List<Computer> computers =  new ArrayList<>();
        // List<Computer> computers = List.of(computer1, computer2, computer3);

        computer1 = new Computer("IBM", "1234ibm", 1000.0);
        computer2 = new Computer("HP", "5555hp", 1300.0);
        computer3 = new Computer("ASUS", "7773rog", 1500.0);
    }

    @Test
    public void test_CONSTRUCTOR_VALID_DATA(){
        computerManager = new ComputerManager();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void test_UNMODIFIABLE(){
        computerManager.getComputers().add(computer1);
    }

    @Test
    public void test_GET_COUNT(){
        computerManager.addComputer(computer1);
        computerManager.addComputer(computer2);

        Assert.assertEquals(2, computerManager.getCount());
    }

    // ADD Computer

    @Test
    public void test_ADD_COMPUTER_VALID_DATA(){
        computerManager = new ComputerManager();
        computerManager.addComputer(computer1);

        Assert.assertEquals(1, computerManager.getCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_ADD_COMPUTER_NULL_DATA(){
        computerManager = new ComputerManager();
        computerManager.addComputer(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_ADD_SAME_COMPUTER_2_TIMES(){
        computerManager = new ComputerManager();
        computerManager.addComputer(computer1);
        computerManager.addComputer(computer1);
    }

    //    // REMOVE Computer

    @Test
    public void test_REMOVE_COMPUTER_VALID_DATA(){
        computerManager = new ComputerManager();
        computerManager.addComputer(computer1);
        computerManager.addComputer(computer2);
        computerManager.addComputer(computer3);

        computerManager.removeComputer("IBM", "1234ibm");

        Assert.assertEquals(2, computerManager.getCount());
    }

    @Test
    public void test_REMOVE_RETURNS_COMPUTER(){
        computerManager = new ComputerManager();
        computerManager.addComputer(computer1);
        computerManager.addComputer(computer2);
        computerManager.addComputer(computer3);

        Assert.assertEquals(computer1, computerManager.removeComputer("IBM", "1234ibm"));
    }

    // GET Computer

    @Test(expected = IllegalArgumentException.class)
    public void test_GET_COMPUTER_when_NULL(){
        computerManager = new ComputerManager();
        computerManager.addComputer(computer1);

        computerManager.getComputer(null, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_GET_COMPUTER_when_NOT_EXIST(){
        computerManager = new ComputerManager();
        computerManager.addComputer(computer1);

        computerManager.getComputer("gosho", "gorenje");
    }


    @Test
    public void test_GET_COMPUTER_when_VALID_DATA(){
        computerManager = new ComputerManager();
        computerManager.addComputer(computer1);

        computerManager.getComputer("IBM", "1234ibm");
    }

    // GET BY_MANUFACTURER

    @Test
    public void test_GET_BY_MANUFACTURER_VALID_DATA_RETURNS_LIST(){
        computerManager = new ComputerManager();
        computerManager.addComputer(computer1);
        computerManager.addComputer(computer2);
        computerManager.addComputer(computer3);

        List<Computer> computersList = List.of(computer1);

        Assert.assertNotNull(computersList);

        //        Assert.assertNotNull(computers); // че не е Null списък
        //        Assert.assertTrue(computers.isEmpty());  // че не е празен

        Assert.assertEquals(computersList, computerManager.getComputersByManufacturer("IBM"));
    }

//
//    @Test
//    public void testGetComputerReturnsCorrect() {
//        computerManager.addComputer(computer1);
//        computerManager.addComputer(computer2);
//
//        Computer returnComputer = computerManager.getComputer(computer1.getManufacturer(), computer1.getModel());
//
//        Assert.assertNotNull(returnComputer);
//        Assert.assertEquals(computer1.getManufacturer(), returnComputer.getManufacturer());
//
////        Assert.assertEquals(computer1, computerManager.getComputer("IBM", "1234ibm"));
//    }

}