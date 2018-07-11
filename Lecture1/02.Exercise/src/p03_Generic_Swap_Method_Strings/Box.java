package p03_Generic_Swap_Method_Strings;

import java.util.List;

public class Box<T> {
    private List<T> items;

    public Box(List<T> items) {
        this.items = items;
    }

    public void swap(int firstItemPos, int secondItemPos) {
        if (firstItemPos > items.size() - 1 || firstItemPos < 0 ||
                secondItemPos > items.size() - 1 || secondItemPos < 0) {
            throw new IllegalArgumentException("Index out of bound!");
        }

        T swapItem = items.get(firstItemPos);
        T otherSwapItem = items.get(secondItemPos);

        items.add(firstItemPos, otherSwapItem);
        items.remove(firstItemPos + 1);

        items.add(secondItemPos, swapItem);
        items.remove(secondItemPos + 1);
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
