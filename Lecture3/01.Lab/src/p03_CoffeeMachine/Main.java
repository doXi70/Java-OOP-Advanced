package p03_CoffeeMachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CoffeeMachine vendor = new CoffeeMachine();

        String line;
        while (!"END".equals(line = reader.readLine())) {
            String[] tokens = line.split(" ");

            if (tokens.length == 1) {
                vendor.insertCoin(tokens[0]);
            } else {
                vendor.buyCoffee(tokens[0].toUpperCase(), tokens[1].toUpperCase());
            }
        }
    }
}
