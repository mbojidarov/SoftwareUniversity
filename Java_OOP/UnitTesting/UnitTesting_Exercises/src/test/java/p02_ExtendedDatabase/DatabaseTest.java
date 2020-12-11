package p02_ExtendedDatabase;

import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

import static org.junit.Assert.*;

public class DatabaseTest {
    private Database database;
    private static final Person[] PEOPLE = {
            new Person(1, "First"),
            new Person(2, "Second"),
            new Person(3, "Third")};

    @Before
    public void setUp() throws OperationNotSupportedException {
//        Person[] PEOPLE = {
//                new Person(1, "First"),
//                new Person(2, "Second"),
//                new Person(3, "Third")};

        database = new Database(PEOPLE);

    }

    // 1. Test find by Username

    // if username = null
    @Test(expected = OperationNotSupportedException.class)
    public void findIfUsernameIsNull() throws OperationNotSupportedException {

        database.findByUsername(null);
    }

    // search if Database is empty (nqma hora)
    @Test(expected = OperationNotSupportedException.class)
    public void searchIfDatabaseIsEmpty() throws OperationNotSupportedException {
        database = new Database(null, null, null);
        database.findByUsername("First");
    }

    // not equal than 1 username
    @Test(expected = OperationNotSupportedException.class)
    public void findIfDatabaseSizeIsNotEqualToOne() throws OperationNotSupportedException {
        database = new Database();
        database.findByUsername("First");
    }

    //valid username search
    @Test
    public void findByUsernameIsValidOperation() throws OperationNotSupportedException {
        Person searchedPerson = database.findByUsername("First");
        assertEquals("First", searchedPerson.getUsername());
    }



    // 2. test find by ID

    // search if Database is empty (nqma hora)
    @Test(expected = OperationNotSupportedException.class)
    public void searchByIDifDatabaseIsEmptyThrowsEmptyData() throws OperationNotSupportedException {
        database = new Database(null, null, null);
        database.findById(3);
    }


    // not equal than 1 ID
    @Test(expected = OperationNotSupportedException.class)
    public void findIDIfDatabaseSizeIsNotEqualToOne() throws OperationNotSupportedException {
        database = new Database();
        database.findById(3);
    }

    //valid ID search
    @Test
    public void findByIDisValidOperation() throws OperationNotSupportedException {
        Person idSearch = database.findById(3);
        assertEquals(3, idSearch.getId());

        assertEquals("Third", idSearch.getUsername());
    }


}