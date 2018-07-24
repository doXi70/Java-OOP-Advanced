package p8_CardGame;

import p8_CardGame.card_comparator.ByPower;
import p8_CardGame.exceptions.CardDoesNotExistsException;
import p8_CardGame.exceptions.CardNotInDeckException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Player {
    private static DeckOfCards deck = new DeckOfCards();
    private String name;
    private Set<Card> hand;

    public Player(String name) {
        this.name = name;
        deck.buildStandardDeck();
        this.hand = new TreeSet<>(new ByPower());
    }

    private boolean cardExistsInHand(Card cardToAdd) {
        for (Card card : hand) {
            if (card.getRank() == cardToAdd.getRank() &&
                    card.getSuite() == cardToAdd.getSuite()) {
                throw new CardNotInDeckException();
            }
        }

        return false;
    }

    private boolean cardIsInTheDeck(Card cardToCheck) {
        for (Card card : deck.getCards()) {
            if (card.getSuite() == cardToCheck.getSuite() &&
                    card.getRank() == cardToCheck.getRank()) {
                return true;
            }
        }

        throw new CardDoesNotExistsException();
    }

    public void addCard(Card card) {
        if (!cardExistsInHand(card) && cardIsInTheDeck(card)) {
            this.hand.add(card);
            this.removeCard(card);
        }
    }

    private void removeCard(Card card) {
        Iterator<Card> iterator = deck.getCards().iterator();
        while (iterator.hasNext()) {
            Card next = iterator.next();
            if (next.getSuite().getPower() == card.getSuite().getPower() &&
                    next.getRank().getPower() == card.getRank().getPower()) {

                iterator.remove();
                break;
            }
        }
    }

    public int getHandSize() {
        return this.hand.size();
    }

    public Card getBestCard() {
        return new ArrayList<>(this.hand).get(4);
    }

    @Override
    public String toString() {
        return String.format("%s wins with %s.",
                this.name, this.getBestCard());
    }
}
