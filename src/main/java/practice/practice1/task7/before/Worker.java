package practice.practice1.task7.before;

/*
7. Нарушение ISP (Interface Segregation Principle) – слишком большой интерфейс
Задача: Разделите интерфейс на отдельные специализированные интерфейсы.
 */

public interface Worker {
    void work();
    void eat();
}
