package p08_CardGame.exceptions;

public class CardDoesNotExistsException extends RuntimeException {
    private static final String ERR_MSG = "No such card exists.";

    public CardDoesNotExistsException() {
        super(ERR_MSG);
    }
}
