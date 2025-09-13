package practice.practice2.task4;

public class GunFactory extends WeaponFactory{
    @Override
    Weapon createWeapon() {
        return new Gun();
    }
}