package p05_CardCompareTo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Card firstCard = new Card(Enum.valueOf(CardRank.class, reader.readLine().toUpperCase()),
                Enum.valueOf(CardSuite.class, reader.readLine().toUpperCase()));

        Card secondCard = new Card(Enum.valueOf(CardRank.class, reader.readLine().toUpperCase()),
                Enum.valueOf(CardSuite.class, reader.readLine().toUpperCase()));

        if (firstCard.compareTo(secondCard) > 0) {
            System.out.println(firstCard);
        } else {
            System.out.println(secondCard);
        }
    }
}
