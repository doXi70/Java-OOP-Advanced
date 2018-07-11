package p01_JarOfT;

import java.util.ArrayDeque;

public class Jar<T> {
    private ArrayDeque<T> stack;

    public Jar() {
        this.stack = new ArrayDeque<>();
    }

    public Jar(ArrayDeque<T> stack) {
        this.stack = stack;
    }

    public void add(T element) {
        this.stack.addFirst(element);
    }

    public T remove() {
        return this.stack.removeFirst();
    }

}
