package p04_Generic_Swap_Method_Integers;

import java.util.List;

public class Box<T> {
    private List<T> items;

    public Box(List<T> items) {
        this.items = items;
    }

    public void swap(int firstItemPos, int secondItemPos) {
        T item = this.items.get(firstItemPos);
        T swap = this.items.get(secondItemPos);

        this.items.add(firstItemPos, swap);
        this.items.remove(firstItemPos + 1);

        this.items.add(secondItemPos, item);
        this.items.remove(secondItemPos + 1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (T item : items) {
            sb.append(String.format("%s: %s", item.getClass().getCanonicalName(), item))
                    .append(System.lineSeparator());
        }

        return sb.toString();
    }
}
