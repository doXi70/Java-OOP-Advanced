package p09_CustomListIterator.customCollections.impl;

import p09_CustomListIterator.customCollections.contracts.CustomList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CustomListImpl<T extends Comparable<T>> implements CustomList<T>, Iterable<T> {
    private List<T> elements;

    public CustomListImpl() {
        this.elements = new ArrayList<>();
    }


    @Override
    public void add(T element) {
        this.elements.add(element);
    }

    @Override
    public T remove(int index) {
        return this.elements.remove(index);
    }

    @Override
    public boolean contains(T element) {
        return this.elements.contains(element);
    }

    @Override
    public void swap(int firstIndex, int secondIndex) {
        if (firstIndex > this.elements.size() - 1 || secondIndex > this.elements.size() - 1 ||
                firstIndex < 0 || secondIndex < 0) {
            return;
        }

        T firstItem = this.elements.get(firstIndex);
        T secondItem = this.elements.get(secondIndex);

        this.elements.add(firstIndex, secondItem);
        this.elements.remove(firstIndex + 1);

        this.elements.add(secondIndex, firstItem);
        this.elements.remove(secondIndex + 1);
    }

    @Override
    public int countGreaterThan(T element) {
        int counter = 0;

        for (T item : this.elements) {
            if (item.compareTo(element) > 0) {
                counter++;
            }
        }

        return counter;
    }

    @Override
    public T getMax() {
        if (!this.elements.isEmpty()) {
            return Collections.max(this.elements);
        }

        return null;
    }

    @Override
    public T getMin() {
        if (!this.elements.isEmpty()) {
            return Collections.min(this.elements);
        }

        return null;
    }

    public int size() {
        return this.elements.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T element : this.elements) {
            sb.append(element).append(System.lineSeparator());
        }

        return sb.toString();
    }

    @Override
    public Iterator<T> iterator() {
        return this.elements.iterator();
    }
}
