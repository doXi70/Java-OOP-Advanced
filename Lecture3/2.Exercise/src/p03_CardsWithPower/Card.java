package p03_CardsWithPower;

public class Card {
    private CardRank rank;
    private CardSuite suite;

    public Card(CardRank rank, CardSuite suite) {
        this.rank = rank;
        this.suite = suite;
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d",
                this.rank.name(), this.suite.name(), this.rank.getPower() + this.suite.getPower());
    }
}
