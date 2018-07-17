package p03_CoffeeMachine;

public class Coffee {
    private CoffeeType type;
    private CoffeeSize size;

    public Coffee(CoffeeType type, CoffeeSize size) {
        this.type = type;
        this.size = size;
    }

    public CoffeeSize getSize() {
        return this.size;
    }
}
