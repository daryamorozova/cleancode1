package theory.practice2.behavioral.iterator.after;

public class Main {
    public static void main(String[] args) {
        BookCollection collection = new BookCollection();
        collection.addBook(new Book("1984"));
        collection.addBook(new Book("Brave New World"));

        // Обойдет коллекцию книг с помощью реализованного итератора
        Iterator<Book> iterator = collection.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().getTitle());
        }
    }
}
