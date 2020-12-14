package bankSafe;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;
import java.util.LinkedHashMap;
import java.util.Map;

public class BankVaultTest {

    private Item item1;
    private Item item2;
    private Item item3;

    private BankVault bankVault;
    private Map<String, Item> vaultCells;

    @Before
    public void setUp() {

        bankVault = new BankVault();
        vaultCells = new LinkedHashMap<>();

        item1 = new Item("Acho1", "123A1");
        item2 = new Item("Acho2", "123A2");
        item3 = new Item("Bobi1", "123B1");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testUnmodifiableCollection() {
        bankVault.getVaultCells().put("A1", item2);

    }

    //ADD
    @Test
    public void testADDValid() throws OperationNotSupportedException {
        bankVault.addItem("A1", item1);
        Assert.assertEquals(12, bankVault.getVaultCells().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testADDinalidCell() throws OperationNotSupportedException {
        bankVault.addItem("K1", item1);
        Assert.assertEquals(11, bankVault.getVaultCells().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testADDinalidCellnotNULL() throws OperationNotSupportedException {
        bankVault.addItem("K1", item1);
        bankVault.addItem("K1", item1);

        Assert.assertEquals(11, bankVault.getVaultCells().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testADDinalidCellthatExist() throws OperationNotSupportedException {
        bankVault.addItem("A1", item1);
        bankVault.addItem("A1", item1);

        Assert.assertEquals(11, bankVault.getVaultCells().size());
    }


    //REMOVE
    @Test
    public void testREMOVEinvalid() throws IllegalArgumentException, OperationNotSupportedException {
        bankVault.addItem("A1", item1);
        bankVault.removeItem("A1", item1);
        Assert.assertEquals(12, bankVault.getVaultCells().size());
    }


    @Test(expected = IllegalArgumentException.class)
    public void testREMOVEinvalidCell() throws IllegalArgumentException, OperationNotSupportedException {
        bankVault.addItem("A1", item1);
        bankVault.removeItem("K1", item1);
        Assert.assertEquals(12, bankVault.getVaultCells().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testREMOVEinvalidCellNULL() throws IllegalArgumentException, OperationNotSupportedException {

        bankVault.removeItem(null, null);
        Assert.assertEquals(12, bankVault.getVaultCells().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testREMOVEinvalidCellNULL2() throws OperationNotSupportedException {

        bankVault.removeItem("A1", item3);
        Assert.assertEquals(12, bankVault.getVaultCells().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAssertTrue() throws OperationNotSupportedException {

        bankVault.removeItem("A1", item3);
        Assert.assertTrue(bankVault.getVaultCells().containsValue(item3));
    }
//
//    @Test
//    public void testADDAssertTrue() throws OperationNotSupportedException {
//        bankVault.getVaultCells().containsValue(item3);
////        bankVault.addItem("A1", item3);
//        Assert.assertFalse(bankVault.getVaultCells().containsValue(item3));
//    }

    @Test(expected = IllegalArgumentException.class)
    public void testADD1() throws OperationNotSupportedException {
        bankVault.addItem("a1", item1);
        bankVault.addItem("a1", item1);

        Assert.assertEquals(11, bankVault.getVaultCells().size());
    }
    @Test(expected = IllegalArgumentException.class)
    public void testADD2() throws OperationNotSupportedException {
        bankVault.addItem("a1", null);
        bankVault.addItem("a1", null);
        bankVault.addItem("A2", null);


        Assert.assertEquals(11, bankVault.getVaultCells().size());
    }
    @Test(expected = OperationNotSupportedException.class)
    public void testADD3() throws OperationNotSupportedException {

        bankVault.addItem("A2", null); //exist


        Assert.assertEquals(11, bankVault.getVaultCells().size());
    }
}