import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class HeroTest {

    private static final String HERO_NAME = "Diablo";
    private static final int HERO_EXP = 50;

    @Test
    public void heroGainsExpWhenTargetIsDead() {
    Axe weaponMock = Mockito.mock(Axe.class);
    Dummy targetMock = Mockito.mock(Dummy.class);

    Mockito.when(targetMock.isDead()).thenReturn(true);
    Mockito.when(targetMock.giveExperience()).thenReturn(targetMock.giveExperience());

    Hero hero = new Hero(HERO_NAME);
    //todo constructor Hero(HERO_NAME, weapon)
    hero.attack(targetMock);

    assertEquals(targetMock.giveExperience(), hero.getExperience());
    }
}