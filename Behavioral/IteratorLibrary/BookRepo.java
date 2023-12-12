import java.util.ArrayList;

public class BookRepo implements Container {
    private ArrayList<Book> books;

    public Iterator getBookIterator() {
        this.books = new ArrayList<>();
        return new BookR();
    }

    void addBook(Book b) {
        this.books.add(b);
    }

    private class BookR implements Iterator {
        int index;

        BookR() {
            this.index = 0;
        }

        public boolean hasNext() {
            if (index < books.size()) {
                return true;
            } else {
                return false;
            }
        }

        public Object Next() {
            if (hasNext()) {
                return books.get(index++);
            }
            return null;
        }
    }
}
