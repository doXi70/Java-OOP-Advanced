package rpg_tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import rpg_lab.models.Hero;
import rpg_lab.models.contracts.Target;
import rpg_lab.models.contracts.Weapon;

@RunWith(MockitoJUnitRunner.class)
public class HeroTests {

    private static final int AXE_ATTACK_POINTS = 10;
    private static final int AXE_DURABILITY = 10;
    private static final int DUMMY_HP = 10;
    private static final int DUMMY_EXP_REWARD = 20;
    private static final String HERO_NAME = "Pesho";

    @Mock
    private Weapon fakeWeapon;

    @Mock
    private Target fakeTarget;

    private Hero hero;

    @Before
    public void initializeAxeAndDummy() {
        this.hero = new Hero(HERO_NAME, this.fakeWeapon);

    }

    @Test
    public void attackGainsExpIfTargetIsDead() {
        Mockito.when(this.fakeTarget.isDead()).thenReturn(true);
        Mockito.when(this.fakeWeapon.getAttackPoints()).thenReturn(AXE_ATTACK_POINTS);
        Mockito.when(this.fakeTarget.giveExperience()).thenReturn(DUMMY_EXP_REWARD);

        this.hero.attack(fakeTarget);
        Assert.assertEquals("Hero should receive exp if fakeTarget is dead",
                DUMMY_EXP_REWARD, this.hero.getExperience());
    }



}
