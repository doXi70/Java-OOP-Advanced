package p04_ListUtilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 10, 25, 40, 45));

        System.out.println(ListUtils.getMax(nums));
        System.out.println(ListUtils.getMin(nums));
    }
}
