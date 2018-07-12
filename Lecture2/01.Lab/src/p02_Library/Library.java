package p02_Library;

import java.util.Iterator;

public class Library<T> implements Iterable<Book> {
    private Book[] books;

    public Library(Book... books) {
        this.books = books;
    }

    @Override
    public Iterator<Book> iterator() {
        return new LibraryIterator();
    }

    private final class LibraryIterator implements Iterator<Book> {
        private int counter = 0;

        @Override
        public boolean hasNext() {
            return this.counter < books.length;
        }

        @Override
        public Book next() {
            this.counter++;
            return books[counter - 1];
        }
    }
}
