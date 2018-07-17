package p03_CardsWithPower;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(
                new Card(Enum.valueOf(CardRank.class, reader.readLine().toUpperCase()),
                        Enum.valueOf(CardSuite.class, reader.readLine().toUpperCase())));
    }
}
