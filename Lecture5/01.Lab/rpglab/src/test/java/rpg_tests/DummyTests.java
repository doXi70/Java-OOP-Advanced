package rpg_tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rpg_lab.models.Axe;
import rpg_lab.models.Dummy;

public class DummyTests {

    private static final int DUMMY_HEALTH = 10;
    private static final int DUMMY_EXP_REWARD = 10;

    private static final int AXE_ATTACK = 5;
    private static final int AXE_DURABILIY = 10;
    private static final int EXPECTED_DURABILITY = AXE_DURABILIY - 1;

    private static final int EXPECTED_DUMMY_HEALTH = 5;

    private Axe axe;
    private Dummy target;

    @Before
    public void initalSetup() {
        this.axe = new Axe(AXE_ATTACK, AXE_DURABILIY);
        this.target = new Dummy(DUMMY_HEALTH, DUMMY_EXP_REWARD);
    }

    @Test()
    public void dummyLoossesHealthIfAttacked() {
        this.axe.attack(target);
        Assert.assertEquals(EXPECTED_DUMMY_HEALTH, this.target.getHealth());
    }

    @Test(expected = IllegalStateException.class)
    public void deadDummyThrowsExceptionIfAttacked() {
        this.axe.attack(target);
        this.axe.attack(target);
        this.axe.attack(target);
    }

    @Test()
    public void deadDummyCanGiveExperience() {
        this.axe.attack(target);
        int expReward = this.target.giveExperience();
        Assert.assertEquals(expReward, DUMMY_EXP_REWARD);
    }

    @Test(expected = IllegalStateException.class)
    public void aliveDummyCantGiveExperience() {
        this.target.takeAttack(AXE_ATTACK);
        this.target.giveExperience();
    }
}
