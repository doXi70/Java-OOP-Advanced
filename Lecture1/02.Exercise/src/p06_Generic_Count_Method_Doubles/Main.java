package p06_Generic_Count_Method_Doubles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int counter = Integer.parseInt(reader.readLine());

        List<Double> doubles = new ArrayList<>();
        for (int i = 0; i < counter; i++) {
            doubles.add(Double.parseDouble(reader.readLine()));
        }

        Double num = Double.parseDouble(reader.readLine());
        Box<Double> doubleBox = new Box<>(doubles);
        System.out.println(doubleBox.compareDoubles(num));
    }
}
