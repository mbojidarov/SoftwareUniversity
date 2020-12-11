package p01_Database;

import org.junit.Test;

import javax.naming.OperationNotSupportedException;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DatabaseTest {
    //todo refactor with @Before SetUp()
    // and private static final VALUES

    //1. constructor test

    @Test
    public void constructorCreateValidObjectsCount() throws OperationNotSupportedException {
        Integer[] elements = {3, 5, 8};
        Database database = new Database(elements);

        assertEquals(3, database.getElements().length);
    }

    @Test
    public void elementsAreEqualBetweenArrayAndObject() throws OperationNotSupportedException {
        Integer[] elements = {3, 5, 8};
        Database database = new Database(elements);

        Integer[] dataElements = database.getElements();

        for (int i = 0; i < elements.length; i++) {

            assertEquals(elements[i], dataElements[i]);
        }
    }
    @Test(expected = OperationNotSupportedException.class)
    public void databaseElementsAreMoreThan16() throws OperationNotSupportedException {
        Integer[] elements = new Integer[20];

        for (int i = 0; i < 20; i++) {
            elements[i] = i;
        }
        Database database = new Database(elements);

    }

    @Test(expected = OperationNotSupportedException.class)
    public void databaseElementsAreLessThan1() throws OperationNotSupportedException {
        Integer[] elements = new Integer[0];
        Database database = new Database(elements);
    }

    // 2. add test

    @Test(expected = OperationNotSupportedException.class)
    public void trowsExceptionWhenElementIsNull() throws OperationNotSupportedException {
        Integer[] elements = {3, 5, 8};
        Database database = new Database(elements);

        database.add(null);
    }
    @Test
    public void addElementWhenIsValid() throws OperationNotSupportedException {
        Integer[] elements = {3, 5, 8};
        Database database = new Database(elements);

        database.add(11); //3, 5, 8, 11
        assertEquals(4, database.getElements().length);
        assertEquals(Integer.valueOf(11), database.getElements()[3]);
    }


    // 3. remove test

    @Test(expected = OperationNotSupportedException.class)
    public void removeAllElement() throws OperationNotSupportedException {
        Integer[] elements = {3, 5, 8};
        Database database = new Database(elements);
        for (int i = 0; i < elements.length; i++) {

            database.remove();
        }
        database.remove(); //ArrayIndexOutOfBoundsException ex
    }

    @Test
    public void removeLastElement() throws OperationNotSupportedException {
        Integer[] elements = {3, 5, 8};
        Database database = new Database(elements);
        database.remove();

        assertEquals(elements.length-1, database.getElements().length);
        assertEquals(Integer.valueOf(5), database.getElements()[1]);
    }
}