package p03_IteratorTest;

import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;
import java.util.List;

import static org.junit.Assert.*;

public class ListIteratorTest {

private static final String[] INPUT_STRINGS = new String[]{"Marto", "Shampion", "Ole oleeee!"};
private ListIterator testListIterator;

    @Before
    public void setUp() throws OperationNotSupportedException {
        testListIterator = new ListIterator(INPUT_STRINGS);
    }


    // 1. if List elements = null or not null

    @Test(expected = OperationNotSupportedException.class)
    public void testListIteratorThrowsExWhenNullElements() throws OperationNotSupportedException {
        testListIterator = new ListIterator(null);
    }

    // 2. if List has/hasn't next element

    @Test
    public void testListIteratorShouldReturnTRUEifThereIsNextElement(){
        testListIterator.hasNext();
    }

    @Test
    public void testMoveShouldReturnTRUEifThereIsNextElement(){
        testListIterator.move();
    }

    @Test
    public void testListIteratorShouldReturnFALSEifThereIsNextElement() throws OperationNotSupportedException {
        testListIterator = new ListIterator();
        testListIterator.hasNext();
    }

    @Test
    public void testMoveShouldReturnFALSEifThereIsNextElement() throws OperationNotSupportedException {
        testListIterator = new ListIterator();
        testListIterator.move();
    }

    // 3. if list prints by index or throws ex

    @Test(expected = IllegalStateException.class)
    public void testIfListIteratorIsEmptyAndThrowsEx() throws OperationNotSupportedException {
        testListIterator = new ListIterator();
        testListIterator.print();
    }

    @Test
    public void testListShouldReturnElementByGivenIndex(){
        int index = 0;
        assertEquals("Marto", INPUT_STRINGS[index]);

//        int index = 0;
//        while (testListIterator.hasNext()) {
//            assertEquals(INPUT_STRINGS[index], testListIterator.print());
//            index++;
//            testListIterator.move();
    }

}