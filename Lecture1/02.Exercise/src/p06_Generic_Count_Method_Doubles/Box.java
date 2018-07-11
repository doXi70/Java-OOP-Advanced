package p06_Generic_Count_Method_Doubles;

import java.util.List;

public class Box<T extends Comparable<T>> {
    private List<T> items;

    public Box(List<T> items) {
        this.items = items;
    }

    public int compareDoubles(T item) {
        int counter = 0;

        for (T element : this.items) {
            if (element.compareTo(item) > 0) {
                counter++;
            }
        }

        return counter;
    }
}
