package rpg_tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rpg_lab.models.Axe;
import rpg_lab.models.Dummy;

public class AxeTests {

    private Axe axe;
    private Dummy dummy;


    @Before
    public void initalSetup() {
        this.axe = new Axe(10, 10);
        this.dummy = new Dummy(10, 10);
    }

    @Test
    public void weaponAttacksLosesDurability() {
        this.axe.attack(this.dummy);
        Assert.assertEquals(9, this.axe.getDurabilityPoints());
    }

    @Test(expected = IllegalStateException.class)
    public void brokenWeaponCantAttack() {
        this.axe.attack(this.dummy);
        this.axe.attack(this.dummy);
    }
}
