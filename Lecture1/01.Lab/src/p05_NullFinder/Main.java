package p05_NullFinder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(null, 12, null, 25, null, null));
        List<String> strings = new LinkedList<>(Arrays.asList("trigger", "mirrge", null, null));

        System.out.println(ListUtils.getNullIndices(nums));
        System.out.println(ListUtils.getNullIndices(strings));
    }
}
