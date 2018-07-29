package rpg_lab.models.contracts;

import rpg_lab.models.Dummy;

public interface Weapon {

    int getAttackPoints();

    int getDurabilityPoints();

    void attack(Dummy target);

}
