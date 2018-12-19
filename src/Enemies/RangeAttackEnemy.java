package Enemies;

public abstract class RangeAttackEnemy extends Enemy {
    public RangeAttackEnemy(String name, int hp, int damage) {
        super(name, hp, damage);
    }
    public abstract int attack();
}
