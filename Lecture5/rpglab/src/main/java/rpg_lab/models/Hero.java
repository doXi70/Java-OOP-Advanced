package rpg_lab.models;

import rpg_lab.models.contracts.Inventory;
import rpg_lab.models.contracts.Item;
import rpg_lab.models.contracts.Target;
import rpg_lab.models.contracts.Weapon;

import java.util.ArrayList;
import java.util.List;

public class Hero implements Inventory {

    private String name;
    private int experience;
    private Weapon weapon;
    private List<Item> items;

    public Hero(String name, Weapon weapon) {
        this.name = name;
        this.experience = 0;
        this.weapon = weapon;
        this.items = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getExperience() {
        return this.experience;
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

    public void attack(Target target) {
        this.weapon.attack(target);

        if (target.isDead()) {
            this.experience += target.giveExperience();
        }
    }

    @Override
    public void addItem(Item item) {
        this.items.add(item);
    }

    @Override
    public Iterable<Item> getItems() {
        return this.items;
    }
}
