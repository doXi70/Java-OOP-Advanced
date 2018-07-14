package p04_Froggy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Lake<Integer> lake;

        String line;
        while (!"END".equals(line = reader.readLine())) {
            lake = new Lake<>(Arrays.stream(line.split("( |, )+")).map(Integer::parseInt).toArray(Integer[]::new));
            StringBuilder sb = new StringBuilder();

            for (Integer aLake : lake) {
                sb.append(aLake).append(", ");
            }

            System.out.println(sb.toString().substring(0, sb.length() - 2));
        }
    }
}
