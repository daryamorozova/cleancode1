package practice.practice2.task6;

/**
 * Реализовать абстрактную фабрику графических элементов (Кнопка, Окно, Меню в стиле Windows и MacOS)
 * Описание
 * Приложение должно работать одинаково на разных платформах (Windows и MacOS), но выглядеть по-разному,
 * соответственно стилям каждой платформы. Мы будем использовать абстрактную фабрику для создания различных
 * графических элементов (например, кнопок, окон и меню), которые будут выглядеть по-разному в зависимости от платформы.
 */

public class Main {
    public static void main(String[] args) {
        GUIFactory guiFactory;

        String osType = "MacOS";

        if ("Windows".equals(osType)) {
            guiFactory = new WindowsFactory();
        } else {
            guiFactory = new MacOsFactory();
        }

        guiFactory.createButton().onClick();
        guiFactory.createMenu().onClick();
        guiFactory.createWindow().onClick();

    }
}