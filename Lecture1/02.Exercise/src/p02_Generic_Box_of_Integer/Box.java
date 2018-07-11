package p02_Generic_Box_of_Integer;

public class Box<T> {
    private T item;

    public Box(T item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return String.format("%s: %s",
                this.item.getClass().getCanonicalName(), this.item);
    }
}
