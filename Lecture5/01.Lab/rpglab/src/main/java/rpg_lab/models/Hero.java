package rpg_lab.models;

import rpg_lab.models.contracts.Weapon;

public class Hero {

    private String name;
    private int experience;
    private Weapon weapon;

    public Hero(String name, Weapon weapon) {
        this.name = name;
        this.experience = 0;
        this.weapon = weapon;
    }

    public String getName() {
        return this.name;
    }

    public int getExperience() {
        return this.experience;
    }

    public Axe getWeapon() {
        return this.weapon;
    }

    public void attack(Dummy target) {
        this.weapon.attack(target);

        if (target.isDead()) {
            this.experience += target.giveExperience();
        }
    }
}
