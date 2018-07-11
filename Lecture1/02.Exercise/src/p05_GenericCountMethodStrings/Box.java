package p05_GenericCountMethodStrings;

import java.util.List;

public class Box<T extends Comparable<T>> {
    private List<T> items;

    public Box(List<T> items) {
        this.items = items;
    }

    public int countOfBiggerItems(T item) {
        int numberOfElements = 0;

        for (T element : this.items) {
            if (element.compareTo(item) > 0) {
                numberOfElements++;
            }
        }

        return numberOfElements;
    }
}
