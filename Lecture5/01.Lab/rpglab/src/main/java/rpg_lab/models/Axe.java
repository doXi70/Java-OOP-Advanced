package rpg_lab.models;

import rpg_lab.models.contracts.Weapon;

public class Axe implements Weapon {

    private int attackPoints;
    private int durabilityPoints;

    public Axe(int attack, int durability) {
        this.attackPoints = attack;
        this.durabilityPoints = durability;
    }

    public int getAttackPoints() {
        return this.attackPoints;
    }

    public int getDurabilityPoints() {
        return this.durabilityPoints;
    }

    public void attack(Dummy target) {
        if (this.durabilityPoints <= 0) {
            throw new IllegalStateException("rpg_lab.models.Weapon is broken.");
        }

        target.takeAttack(this.attackPoints);
        this.durabilityPoints -= 1;
    }
}
