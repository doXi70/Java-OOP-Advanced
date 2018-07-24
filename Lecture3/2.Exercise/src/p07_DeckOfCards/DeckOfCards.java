package p07_DeckOfCards;

import java.util.ArrayList;
import java.util.List;

public class DeckOfCards {
    private static final int MAX_RANK_VALUE = 12;
    private static final int MAX_SUIT_VALUE = 3;

    private List<Card> cards;

    public DeckOfCards() {
        this.cards = new ArrayList<>();
    }

    public void buildStandardDeck() {
        int counter = 0;

        for (int i = 0; i < CardRank.values().length; i++) {
            this.cards.add(new Card(CardRank.values()[i], CardSuite.values()[counter]));

            if (i == MAX_RANK_VALUE) {
                if (counter == MAX_SUIT_VALUE) {
                    break;
                }

                i = -1;
                counter++;
            }

        }
    }

    public void printDeck() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }
}
