package rpg_lab.models.contracts;

public interface Inventory {

    void addItem(Item item);

    Iterable<Item> getItems();
}
