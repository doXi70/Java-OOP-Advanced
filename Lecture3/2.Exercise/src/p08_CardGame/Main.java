package p08_CardGame;

import p08_CardGame.exceptions.CardDoesNotExistsException;
import p08_CardGame.exceptions.CardNotInDeckException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Player firstPlayer = new Player(reader.readLine());
        Player secondPlayer = new Player(reader.readLine());

        while (firstPlayer.getHandSize() < 5) {
            addCard(reader, firstPlayer);
        }

        while (secondPlayer.getHandSize() < 5) {
            addCard(reader, secondPlayer);
        }

        if (firstPlayer.getBestCard().compareTo(secondPlayer.getBestCard()) > 0) {
            System.out.println(firstPlayer);
        } else {
            System.out.println(secondPlayer);
        }
    }

    private static void addCard(BufferedReader reader, Player player) throws IOException {
        try {
            Card card = createNewCard(reader);
            player.addCard(card);
        } catch (CardNotInDeckException | CardDoesNotExistsException iae) {
            System.out.println(iae.getMessage());
        }
    }

    private static Card createNewCard(BufferedReader reader) throws IOException {
        String[] tokens = reader.readLine().split(" of ");

        Card card = null;
        try {
            card = new Card(
                    CardRank.valueOf(tokens[0]),
                    CardSuite.valueOf(tokens[1]));

        } catch (IllegalArgumentException iae) {
            throw new CardDoesNotExistsException();
        }

        return card;
    }

    private static void printAnnotationInfo(String clazz) {
        Annotation annotation = null;

        if (clazz.equals("Rank")) {
            annotation = CardRank.class.getAnnotation(CustomAnnotation.class);
        } else {
            annotation = CardSuite.class.getAnnotation(CustomAnnotation.class);
        }

        System.out.println(String.format("Type = %s, Description = %s", ((CustomAnnotation) annotation).type(),
                ((CustomAnnotation) annotation).description()));
    }
}
