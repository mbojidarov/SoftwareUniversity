import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AxeTest {
    private static final int AXE_ATTACK = 5;
    private static final int AXE_DURABILITY = 3;

    private Axe weapon;

    @Before
    public void setUp() {
        this.weapon = new Axe(AXE_ATTACK, AXE_DURABILITY);
    }

    @Test
    public void axeLoosesDurabilityAfterEachAttack() {    // decrease durability
//        Axe weapon = new Axe(5, 3);
        Dummy target = new Dummy(100, 50);

        weapon.attack(target);
        assertEquals(2, weapon.getDurabilityPoints(), 0);
    }

    @Test
    public void axeCanLoosesAllDurability() {     // zero durability
//        Axe weapon = new Axe(5, 3);
        Dummy target = new Dummy(100, 50);

        for (int i = 0; i < 3; i++) {
            weapon.attack(target);
        }
        assertEquals(0, weapon.getDurabilityPoints(), 0);
    }

    @Test(expected = IllegalStateException.class)
    public void attackingWithBrokenWeapon() {            // no durability
        Axe axe = new Axe(5, 0);
        Dummy target = new Dummy(100, 50);

        axe.attack(target);
    }
}