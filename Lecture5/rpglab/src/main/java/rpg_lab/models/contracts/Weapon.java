package rpg_lab.models.contracts;

public interface Weapon {

    int getAttackPoints();

    int getDurabilityPoints();

    void attack(Target target);

}
