package theory.practice2.behavioral.iterator.before;

public class Main {
    public static void main(String[] args) {
        BookCollection collection = new BookCollection();
        collection.addBook(new Book("1984"));
        collection.addBook(new Book("Brave New World"));

        // Прямой доступ к внутреннему списку для итерации
        // Жесткая привязка к коллекции которую мы используем
        for (Book book : collection.getBooks()) {
            System.out.println(book.getTitle());
        }
    }
}
