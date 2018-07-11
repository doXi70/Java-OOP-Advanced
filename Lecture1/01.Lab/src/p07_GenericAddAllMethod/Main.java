package p07_GenericAddAllMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(2, null, 25));
        List<Double> doubles = new ArrayList<>(Arrays.asList(2.5, 5.5, null, 16.20));

        List<Number> destination = new ArrayList<>();
        ListUtils.addAll(destination, integers);
        ListUtils.addAll(destination, doubles);
        System.out.println(destination);
    }
}
