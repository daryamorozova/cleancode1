package practice.practice2.task4;

public class SwordFactory extends WeaponFactory {
    @Override
    Weapon createWeapon() {
        return new Sword();
    }
}