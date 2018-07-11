package p04_Generic_Swap_Method_Integers;

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

        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            integers.add(Integer.parseInt(reader.readLine()));
        }

        Box<Integer> integerBox = new Box<>(integers);
        int[] swaps = Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        integerBox.swap(swaps[0], swaps[1]);
        System.out.println(integerBox);
    }
}
