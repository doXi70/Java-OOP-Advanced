package p02_Collection;

import java.util.Iterator;

public class ListyIterator<T> implements Iterable<T> {
    private int index;
    private T[] items;

    public ListyIterator(T... items) {
        this.items = items;
    }

    public boolean move() {
        if (items != null && hasNext()) {
            index++;
            return true;
        }

        return false;
    }

    public boolean hasNext() {
        return index < items.length - 1;
    }


    public void print() {
        if (items.length > 0) {
            System.out.println(items[index]);
        } else {
            System.out.println("Invalid Operation!");
        }
    }


    public void printAll() {
        for (T item : items) {
            System.out.print(item + " ");
        }

        System.out.println();
    }

    @Override
    public Iterator<T> iterator() {
        return new ListyIter();
    }

    private final class ListyIter implements Iterator<T> {
        private int index;

        public ListyIter() {
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            return index < items.length - 1;
        }

        @Override
        public T next() {
            return items[index];
        }
    }
}
