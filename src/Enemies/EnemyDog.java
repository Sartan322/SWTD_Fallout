package Enemies;

import Hero.Hero;

import java.util.Random;

public class EnemyDog extends Enemy {
    final Random random = new Random();

    public EnemyDog(String name, Hero hero) {
        super(name, hero);
        this.hp = 20;
        this.damageMin = 1;
        this.damageMax = 4;
    }
}
