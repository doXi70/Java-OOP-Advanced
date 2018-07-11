package p05_GenericCountMethodStrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());

        List<String> strings = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            strings.add(reader.readLine());
        }

        Box<String> stringBox = new Box<>(strings);
        System.out.println(stringBox.countOfBiggerItems(reader.readLine()));
    }
}
