package Enemies;

public class Raider extends RangeAttackEnemy {
    private int armor;
    public Raider(String name, int hp, int damage) {
        super(name, hp, damage);
        super.name = "Рэйдер";
        super.hp = 15;
        armor = 15;

    }

    @Override
    public int attack() {
        return 0;
    }
}
