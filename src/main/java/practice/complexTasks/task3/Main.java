package practice.complexTasks.task3;

/**
 * Разработка библиотеки для виртуальной библиотеки книг
 * Цель: Создать библиотеку, которая предоставляет функции просмотра каталога книг, чтения книг и загрузки их для офлайн чтения,
 * с особым вниманием к ленивой загрузке и эффективному управлению ресурсами.
 *
 * Паттерны проектирования:
 * Proxy: Используйте Lazy Loading Proxy для отложенной загрузки книг, что позволяет уменьшить начальную нагрузку
 * на систему и использовать ресурсы эффективнее.
 * Builder: Для построения сложных объектов книг, которые могут включать различные компоненты, такие как обложка,
 * описание, содержание, авторы.
 *
 * Архитектура библиотеки:
 * BookBuilder: Класс для построения книг с различными характеристиками.
 * Book: Базовый класс для книги, содержит основную информацию и методы доступа.
 * BookProxy: Proxy класс, который управляет доступом к объекту Book, осуществляя загрузку данных
 * только по необходимости (например, при первом обращении к содержанию книги).
 *
 * Пример использования
 * // Инициализация BookBuilder для создания книги
 * BookBuilder builder = new BookBuilder();
 * Book book = builder.setTitle("War and Peace")
 * .setAuthor("Leo Tolstoy")
 * . setDescription("A historical novel about the Napoleonic Wars.")
 * .build();
 *
 * // Инициализация Рrоху для ленивой загрузки
 * BookProxy proxy = new BookProxy(book);
 *
 * // Доступ к содержимому книги через Рroхy, загрузка происходит только при
 * первом обращении
 * String content = proxy.getContent();
 * System.out.println("Content of the book: " + content);
 *
 *
 *
 */

public class Main {
    public static void main(String[] args) {
        // Создаем книгу с помощью Builder
        Book book = new Book.Builder()
                .setTitle("War and Peace")
                .setAuthor("Leo Tolstoy")
                .setDescription("A historical novel about the Napoleonic Wars.")
                .build();

        // Используем Proxy для ленивой загрузки
        BookProxy proxy = new BookProxy(book);

        // Получаем содержимое книги через Proxy
        String content = proxy.getContentMethod();
        System.out.println("Content of the book: " + content);
    }
}