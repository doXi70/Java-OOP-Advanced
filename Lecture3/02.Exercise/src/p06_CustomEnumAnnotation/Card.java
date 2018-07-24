package p06_CustomEnumAnnotation;

public class Card implements Comparable<Card> {
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

    @Override
    public int compareTo(Card other) {
        return (this.rank.getPower() + this.suite.getPower()) - (other.rank.getPower() + other.suite.getPower());
    }
}
