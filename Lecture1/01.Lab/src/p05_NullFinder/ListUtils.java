package p05_NullFinder;

import java.util.ArrayList;
import java.util.List;

public class ListUtils {

    public static <T extends Comparable<T>> T getMin(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Empty list!");
        }

        T min = list.get(0);

        for (T t : list) {
            if (t.compareTo(min) < 0) {
                min = t;
            }
        }

        return min;
    }

    public static <T extends Comparable<T>> T getMax(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Empty list!");
        }

        T max = list.get(0);

        for (T t : list) {
            if (max.compareTo(t) < 0) {
                max = t;
            }
        }

        return max;
    }

    public static <T> List<Integer> getNullIndices(List<?> list) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == null) {
                result.add(i);
            }
        }

        return result;
    }

}
