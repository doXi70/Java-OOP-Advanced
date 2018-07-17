package p01_CardSuit;

public class Main {
    public static void main(String[] args) {
        CardSuite[] cardSuites = CardSuite.values();

        System.out.println("Card Suits:");
        for (CardSuite cardSuite : cardSuites) {
            System.out.println(String.format("Ordinal value: %d; Name value: %s",
                    cardSuite.ordinal(), cardSuite.name()));
        }
    }
}
