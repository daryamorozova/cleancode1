package practice.practice2.task8;

//добавляя товары, указывая скидку и выбирая способ оплаты.

public class Character {
    private String health;
    private String damage;
    private String armour;
    private String magic;

    public Character(String health, String damage, String armour, String magic) {
        this.health = health;
        this.damage = damage;
        this.armour = armour;
        this.magic = magic;
    }

    public Character(Builder builder){
        this.health = builder.health;
        this.damage = builder.damage;
        this.armour = builder.armour;
        this.magic = builder.magic;
    }

    @Override
    public String toString() {
        return "Character{" +
                "health='" + health + '\'' +
                ", damage='" + damage + '\'' +
                ", armour='" + armour + '\'' +
                ", magic='" + magic + '\'' +
                '}';
    }

    static class Builder {
        private String health;
        private String damage;
        private String armour;
        private String magic;;


        public Builder setHealth(String health) {
            this.health = health;
            return this;
        }

        public Builder setDamage(String damage) {
            this.damage = damage;
            return this;
        }

        public Builder setArmour(String armour) {
            this.armour = armour;
            return this;
        }

        public Builder setMagic(String magic) {
            this.magic = magic;
            return this;
        }

        public Character build() {
            return new Character(this);
        }
    }
}
