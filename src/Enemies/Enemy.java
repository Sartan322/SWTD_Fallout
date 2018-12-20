package Enemies;

import Hero.Hero;

public abstract class Enemy {
    String name;
    int hp;
    int damageMin;
    int damageMax;
    Hero hero;

    public Enemy(String name, Hero hero) {
        this.hero = hero;
        this.name = name;
        this.hp = hp;
        this.damageMin = damageMin;
        this.damageMax = damageMax;
    }
}
