package p03_CoffeeMachine;

public enum Coin {
    ONE(1), TWO(2), FIVE(5), TEN(10), TWENTY(20), FIFTY(50);

    private int coinAsNumber;

    Coin(int coinAsNumber) {
        this.coinAsNumber = coinAsNumber;
    }

    public int getCoinAsNumber() {
        return this.coinAsNumber;
    }


}
