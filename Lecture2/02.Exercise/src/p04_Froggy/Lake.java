package p04_Froggy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@SuppressWarnings("unchecked")
public class Lake<T> implements Iterable<T> {
    private List<T> lake;

    public Lake(T... lake) {
        this.lake = new ArrayList<>(Arrays.asList(lake));
    }


    @Override
    public Iterator<T> iterator() {
        return new Frog();
    }

    private final class Frog implements Iterator<T> {
        private int evenIndex;
        private int oddIndex;

        Frog() {
            this.evenIndex = -2;
            this.oddIndex = -1;
        }

        @Override
        public boolean hasNext() {
            if (lake.size() != 1) {
                return this.oddIndex + 2 < lake.size();
            }

            return this.oddIndex == -1;
        }

        @Override
        public T next() {
            if (lake.size() == 1) {
                this.oddIndex++;
                return lake.get(0);
            }

            if (this.evenIndex + 2 < lake.size()) {
                this.evenIndex += 2;
                return lake.get(evenIndex);
            }

            this.oddIndex += 2;
            return lake.get(oddIndex);
        }
    }
}
