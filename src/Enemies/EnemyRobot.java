package Enemies;

import Hero.Hero;

import java.util.Random;

public class EnemyRobot extends Enemy {
    final Random random = new Random();

    public EnemyRobot(String name, Hero hero) {
        super(name, hero);
        this.hp = 40;
        this.damageMin = 3;
        this.damageMax = 8;
    }
}