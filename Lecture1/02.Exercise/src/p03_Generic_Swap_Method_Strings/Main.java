package p03_Generic_Swap_Method_Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());

        List<String> boxes = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            boxes.add(reader.readLine());
        }

        Box<String> stringBox = new Box<>(boxes);
        int[] swaps = Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        stringBox.swap(swaps[0], swaps[1]);
        System.out.println(stringBox);
    }
}
