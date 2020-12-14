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
    public void testGetCount() {

        computerManager.addComputer(computer1);
        Assert.assertEquals(1, computerManager.getCount());
    }

    // ADD Computer

    @Test
    public void Add(){
        computerManager.addComputer(computer1);
        Assert.assertEquals(1, computerManager.getCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddComputerIfNullInput() {

        computer1 = null;
        computerManager.addComputer(computer1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddIfAlreadyExist(){
        computerManager.addComputer(computer1);
        computerManager.addComputer(computer1);
    }

    // REMOVE Computer

    @Test
    public void testRemoveComputer(){
        computerManager.addComputer(computer1);
        computerManager.removeComputer("IBM", "1234ibm");
//        Assert.assertEquals();
    }

    // TEST - Unmodifiable LIST!!!!!!!!!
            // Ako probvame da go modificirame -> throws "UnsupportedOperationException"

    @Test(expected = UnsupportedOperationException.class)
    public void getListOfComputers(){

        computerManager.getComputers().add(computer1);
    }

    // GET Computer

    @Test(expected = IllegalArgumentException.class)
    public void testGetComputerIfFieldsAreNull() {

        computer1 = new Computer("IBM", "1234ibm", 1000.0);
        computerManager.addComputer(computer1);
        computerManager.getComputer("gosho", "pesho");
    }


    @Test(expected = IllegalArgumentException.class)
    public void testGetComputerIfModelIsNull() {

        computer1 = new Computer("IBM", null, 1000.0);
        computerManager.addComputer(computer1);
        computerManager.getComputer("IBM", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetComputerIfManufactturersNull() {

        computer1 = new Computer(null, "1234ibm", 1000.0);
        computerManager.addComputer(computer1);
        computerManager.getComputer(null, "1234ibm");
    }

    @Test
    public void testGetComputerByManufactturer() {

        computer1 = new Computer("IBM", "1234ibm", 1000.0);
        computerManager.addComputer(computer1);
        computerManager.addComputer(computer2);

        List<Computer> computers = computerManager.getComputersByManufacturer(computer1.getManufacturer());
        Assert.assertNotNull(computers);
        Assert.assertEquals(computers.get(0).getManufacturer(), computer1.getManufacturer());


//        computers.add(computer1);
//
//        Assert.assertEquals(computers, computerManager.getComputersByManufacturer("IBM"));
    }
    @Test
    public void testGetComputerByManufactturerWhenEmpty(){
        List<Computer> computers = computerManager.getComputersByManufacturer(computer1.getManufacturer());

        Assert.assertNotNull(computers); // че не е Null списък
        Assert.assertTrue(computers.isEmpty());  // че не е празен
    }

    @Test
    public void testGetComputerReturnsCorrect() {
        computerManager.addComputer(computer1);
        computerManager.addComputer(computer2);

        Computer returnComputer = computerManager.getComputer(computer1.getManufacturer(), computer1.getModel());

        Assert.assertNotNull(returnComputer);
        Assert.assertEquals(computer1.getManufacturer(), returnComputer.getManufacturer());

//        Assert.assertEquals(computer1, computerManager.getComputer("IBM", "1234ibm"));
    }

}