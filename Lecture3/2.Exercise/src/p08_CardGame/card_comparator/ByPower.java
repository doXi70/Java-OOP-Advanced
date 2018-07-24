package p08_CardGame.card_comparator;

import p08_CardGame.Card;

import java.util.Comparator;

public class ByPower implements Comparator<Card> {

    @Override
    public int compare(Card card1, Card card2) {
        return (card1.getRank().getPower() + card1.getSuite().getPower())
                - (card2.getRank().getPower() + card2.getSuite().getPower());
    }
}
