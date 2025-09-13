package theory.practice2.behavioral.iterator.after;

public interface Iterator<T> {
    boolean hasNext(); // метод возвращает true если есть след элемент в коллекции
    T next(); // метод возвращает следующий элемент коллекции
}
