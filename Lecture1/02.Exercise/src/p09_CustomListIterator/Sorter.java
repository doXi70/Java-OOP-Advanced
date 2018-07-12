package p09_CustomListIterator;


import p09_CustomListIterator.customCollections.impl.CustomListImpl;

public class Sorter {
    public static <T extends Comparable<T>> void sort(CustomListImpl<T> list) {
        list.sort();
    }
}
