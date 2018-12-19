package Enemies;

public abstract class Enemy {
    String name;
    int hp;
    int damage;

    public Enemy(String name, int hp, int damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }
}
