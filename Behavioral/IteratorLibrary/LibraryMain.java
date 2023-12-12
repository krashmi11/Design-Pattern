public class LibraryMain {
    public static void main(String[] args) {
        BookRepo br = new BookRepo();
        Iterator it = br.getBookIterator();
        Book b1 = new Book("Doglapan", "Ashnoor grover");
        br.addBook(b1);
        br.addBook(new Book("Creative Mind", "Shilpa Rao"));
        while (it.hasNext()) {
            Book b = (Book) it.Next();
            System.out.println(b.getTitle() + " " + b.getAuthor());
        }
    }
}
