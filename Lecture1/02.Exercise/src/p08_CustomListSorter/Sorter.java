package p08_CustomListSorter;


import p08_CustomListSorter.customCollections.impl.CustomListImpl;

public class Sorter {
    public static <T extends Comparable<T>> void sort(CustomListImpl<T> list) {
        list.sort();
    }
}
