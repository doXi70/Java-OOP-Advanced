package p03_CoffeeMachine;

import java.util.ArrayList;
import java.util.List;

public class CoffeeMachine {
    private List<Coffee> coffees;
    private List<Coin> totalCoins;

    public CoffeeMachine() {
        this.coffees = new ArrayList<>();
        this.totalCoins = new ArrayList<>();
    }

    public void buyCoffee(String size, String type) {
        int currentTotalCoins = getCurrentCoinsInMachine();
        Coffee coffee = new Coffee(getCoffeeType(type), getCoffeeSize(size));

        if (coffee.getSize().getPrice() < currentTotalCoins) {
            this.coffees.add(coffee);
            this.totalCoins.clear();
        }
    }

    private int getCurrentCoinsInMachine() {
        return this.totalCoins.stream().mapToInt(Coin::getCoinAsNumber).sum();
    }

    private CoffeeSize getCoffeeSize(String size) {
        switch (CoffeeSize.valueOf(size)) {
            case SMALL:
                return CoffeeSize.SMALL;
            case DOUBLE:
                return CoffeeSize.DOUBLE;
            default:
                return CoffeeSize.NORMAL;
        }
    }

    private CoffeeType getCoffeeType(String type) {
        switch (CoffeeType.valueOf(type.toUpperCase())) {
            case ESPRESSO:
                return CoffeeType.ESPRESSO;
            case IRISH:
                return CoffeeType.IRISH;
            default:
                return CoffeeType.LATTE;
        }
    }

    public void insertCoin(String coin) {
        this.totalCoins.add(Coin.valueOf(coin));
    }

    public Iterable<Coffee> coffeesSold() {
        return this.coffees;
    }
}
