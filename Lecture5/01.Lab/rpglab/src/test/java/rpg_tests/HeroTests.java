package rpg_tests;

import org.junit.Before;

public class HeroTests {

    public static final int AXE_ATTACK_POINTS = 10;
    public static final int AXE_DURABILITY = 10;
    public static final int DUMMY_HP = 10;
    public static final int DUMMY_EXP_REWARD = 20;
    public static final String HERO_NAME = "Pesho";

    private Axe axe;
    private Dummy target;
    private Hero hero;

    @Before
    public void initializeAxeAndDummy() {
        this.axe = new Axe(AXE_ATTACK_POINTS, AXE_DURABILITY);
        this.target = new Dummy(DUMMY_HP, DUMMY_EXP_REWARD);
        this.hero = new Hero(HERO_NAME, axe);
    }

    @Test
    public void attackGainsExpIfTargetIsDead() {

    }
}
