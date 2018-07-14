package p01_ListyIterator;

public class ListyIterator<T> {
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
}
