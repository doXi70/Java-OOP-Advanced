package p8_CardGame;

public class Card implements Comparable<Card> {
    private CardRank rank;
    private CardSuite suite;

    public Card(CardRank rank, CardSuite suite) {
        this.rank = rank;
        this.suite = suite;
    }

    public CardRank getRank() {
        return this.rank;
    }

    public CardSuite getSuite() {
        return this.suite;
    }

    @Override
    public String toString() {
        return String.format("%s of %s",
                this.rank.name(), this.suite.name());
    }

    @Override
    public int compareTo(Card other) {
        return (this.rank.getPower() + this.suite.getPower()) - (other.rank.getPower() + other.suite.getPower());
    }
}
