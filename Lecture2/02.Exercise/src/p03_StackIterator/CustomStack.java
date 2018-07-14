package p03_StackIterator;

import java.util.*;

public class CustomStack<T> implements Iterable<T> {
    private List<T> elements;

    public CustomStack(T... elements) {
        this.elements = new ArrayList<>(Arrays.asList(elements));
    }

    public void push(T... elements) {
        Collections.addAll(this.elements, elements);
    }

    public void pop() {
        if (this.elements.size() == 0) {
            throw new IllegalArgumentException();
        }

        this.elements.remove(this.elements.get(this.elements.size() - 1));
    }

    public boolean isEmpty() {
        return this.elements.size() == 0;
    }

    public int size() {
        return this.elements.size();
    }

    public T get(int index) {
        return this.elements.get(index);
    }

    @Override
    public Iterator<T> iterator() {
        return new CustomStackIterator();
    }

    private final class CustomStackIterator implements Iterator<T> {
        private int cursor;

        @Override
        public boolean hasNext() {
            return elements.size() > cursor;
        }

        @Override
        public T next() {
            return elements.get(cursor++);
        }
    }
}
