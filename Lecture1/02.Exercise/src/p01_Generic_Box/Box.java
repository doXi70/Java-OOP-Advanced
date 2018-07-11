package p01_Generic_Box;

import java.util.List;

public class Box<T> {
    private List<T> params;

    @Override
    public String toString() {
        return this.params.toString();
    }
}
