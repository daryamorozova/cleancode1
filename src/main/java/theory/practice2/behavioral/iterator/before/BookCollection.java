package theory.practice2.behavioral.iterator.before;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class BookCollection {
    private Set<Book> books = new HashSet<>();

    public void addBook(Book book) {
        books.add(book);
    }

    // приходится менять метод при изменении коллекции
    public Set<Book> getBooks() {
        return books;
    }
}
