package practice.practice2.task8;

/**
 * Реализовать строитель для создания персонажей в игре
 * Описание
 * В игре игрок создает персонажа, задавая его параметры, такие как здоровье, урон, броня и магия.
 * Паттерн Builder поможет организовать создание персонажа, позволяя задавать его параметры поэтапно
 * и не перегружать конструктор класса Character.
 */

public class Main {
    public static void main(String[] args) {
        Character character = new Character("10", "10", "10", "10");

        Character characterFlex = new Character.Builder()
                .setHealth("10")
                .setMagic("100")
                .build();

        System.out.println(characterFlex);
        System.out.println(character);
    }


}
