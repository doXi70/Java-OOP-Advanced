package p01_ListyIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ListyIterator<String> list = null;
        String line;
        while (!"END".equals(line = reader.readLine())) {
            switch (line.split(" ")[0]) {
                case "Create":
                    list = new ListyIterator<>(Arrays.stream(line.split(" ")).skip(1).toArray(String[]::new));
                    break;
                case "Move":
                    System.out.println(list.move());
                    break;
                case "Print":
                    list.print();
                    break;
                case "HasNext":
                    System.out.println(list.hasNext());
                    break;
            }
        }

    }
}
