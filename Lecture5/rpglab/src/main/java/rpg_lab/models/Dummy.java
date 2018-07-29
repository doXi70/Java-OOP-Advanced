package rpg_lab.models;

import rpg_lab.models.contracts.Item;
import rpg_lab.models.contracts.Target;

import java.util.List;
import java.util.Random;

public class Dummy implements Target {

    private int health;
    private int experience;
    private List<Item> possibleLoot;

    public Dummy(int health, int experience) {
        this.health = health;
        this.experience = experience;
        this.possibleLoot = List.of(
                new Axe(10, 5),
                new Axe(10, 10),
                new Axe(20, 20));
    }

    public Item giveLoot() {
        if (!this.isDead()) {
            throw new IllegalStateException("Target is not dead!");
        }

        Random random = new Random();
        return this.possibleLoot.get(random.nextInt(3));
    }

    public int getHealth() {
        return this.health;
    }

    public void takeAttack(int attackPoints) {
        if (this.isDead()) {
            throw new IllegalStateException("rpg_lab.models.Target is dead.");
        }

        this.health -= attackPoints;
    }

    public int giveExperience() {
        if (!this.isDead()) {
            throw new IllegalStateException("Target is not dead.");
        }

        return this.experience;
    }

    public boolean isDead() {
        return this.health <= 0;
    }
}
