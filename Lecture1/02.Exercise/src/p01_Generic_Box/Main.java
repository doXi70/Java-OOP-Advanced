package p01_Generic_Box;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(reader.readLine());
        for (int i = 0; i < count; i++) {
            Box<String> box = new Box<>(reader.readLine());
            System.out.println(box);
        }
    }
}
