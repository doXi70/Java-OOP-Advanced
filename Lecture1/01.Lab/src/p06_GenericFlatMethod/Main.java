package p06_GenericFlatMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>(Arrays.asList(1, 5, 10, 25));

        List<Double> doubles = new ArrayList<>();
        Collections.addAll(doubles, 5.5, 20.3, 15.5);

        List<List<? extends Number>> jagged = new ArrayList<>();
        Collections.addAll(jagged, ints, doubles);

        List<Number> dest = new ArrayList<>();
        ListUtils.flatten(dest, jagged);
        System.out.println(dest);
    }
}
