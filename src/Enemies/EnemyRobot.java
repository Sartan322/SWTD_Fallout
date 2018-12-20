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
    public void attack() {
        int chance = random.nextInt(damageMax - damageMin);
        int chanceCrit = random.nextInt(100);
        if (chanceCrit > 80) {
            System.out.println("*Критический удар!*");
            System.out.println("" + name + "*наносит удар = " + damageMax + 2);
            hero.setHealthPoints(hero.getHealthPoints() - (damageMax + 2));
        }
        System.out.println("" + name + "*наносит удар = " + damageMin + chance);
        hero.setHealthPoints(hero.getHealthPoints() - (damageMin + chance));
    }
    public int getHp() {
        return hp;
    }

    public void setHp(int minus) {
        hp -= minus;
    }

    public String getName() {
        return name;
    }
}
