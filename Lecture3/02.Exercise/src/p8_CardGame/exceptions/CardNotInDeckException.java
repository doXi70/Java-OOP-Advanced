package p8_CardGame.exceptions;

public class CardNotInDeckException extends RuntimeException {
    private static final String ERR_MSG = "Card is not in the deck.";

    public CardNotInDeckException() {
        super(ERR_MSG);
    }
}
