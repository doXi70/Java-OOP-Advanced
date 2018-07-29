package rpg_lab.models.contracts;

public interface Target {

    int getHealth();

    void takeAttack(int attackPoints);

    int giveExperience();

    boolean isDead();

    Item giveLoot();

}
