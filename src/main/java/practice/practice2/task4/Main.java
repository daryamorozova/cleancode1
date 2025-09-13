package practice.practice2.task4;

/**
 * Реализовать фабричный метод оружия (Меч, Лук, Пистолет)
 * Описание
 * В этой задаче нам нужно создать систему для создания различных видов оружия в игре (например, мечи, луки и пистолеты).
 * Все оружие будет иметь общий интерфейс, но конкретные реализации оружия будут различаться.
 * Мы будем использовать фабричный метод, чтобы централизованно создавать объекты оружия.
 */

public class Main {
    public static void main(String[] args) {
        String weaponType = "Gun";
        WeaponFactory factory = new GunFactory();

        if (weaponType.equals("Sword")) {
            new SwordFactory().createWeapon();
        } else if (weaponType.equals("Bow")) {
            new BowFactory().createWeapon();
        } else {
            new GunFactory().createWeapon();
        }

       Weapon weapon = factory.createWeapon();
       weapon.attack();
    }
}