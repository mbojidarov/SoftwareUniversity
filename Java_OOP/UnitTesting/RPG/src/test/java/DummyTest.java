import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DummyTest {

    private Axe weapon;

    @Before
    public void setUp(){
        this.weapon = new Axe(10, 20);
    }

    @Test
    public void dummyLosesHealthWhenAttacked() {

        Dummy dummy = new Dummy(100, 50);

        weapon.attack(dummy);
        assertEquals(90, dummy.getHealth());
    }

    @Test
    public void dummyLosesAllHealth() {

        Dummy dummy = new Dummy(9, 50);

        dummy.takeAttack(10);
        assertEquals(-1, dummy.getHealth());
    }

    @Test(expected = IllegalStateException.class)
    public void dummyIsDeadAndThrowsAnException() {

        Dummy dummy = new Dummy(-1, 50);

        dummy.takeAttack(10);
    }

    @Test
    public void dummyIsDeadAndGiveXP() {
        Dummy dummy = new Dummy(-5, 50);

        assertEquals(50, dummy.giveExperience());
    }

    @Test(expected = IllegalStateException.class)
    public void dummyIsALIVEAndCanNOTGiveXP() {
        Dummy dummy = new Dummy(50, 50);

        assertEquals(50, dummy.giveExperience());
    }
}