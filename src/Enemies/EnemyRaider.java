package Enemies;

import Hero.Hero;

public class EnemyRaider extends Enemy {
    public EnemyRaider(String name, Hero hero) {
        super(name, hero);
        this.hp = 40;
        this.damageMin = 10;
        this.damageMax = 20;
    }
}
