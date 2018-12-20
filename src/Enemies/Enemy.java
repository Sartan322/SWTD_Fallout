package Enemies;

import Hero.Hero;

import java.util.Random;

public abstract class Enemy {
    final Random random = new Random();
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

    public void attack() {
        int chance = random.nextInt(damageMax - damageMin);
        int chanceCrit = random.nextInt(100);
        if (chanceCrit > 80) {
            System.out.println("*Критический удар!*");
            System.out.println(" " + name + " " + "*наносит удар = " + damageMax + 2);
            hero.setHealthPoints(hero.getHealthPoints() - (damageMax + 2));
        }
        System.out.println(" " + name + " " + "*наносит удар = " + (damageMin + chance));
        hero.setHealthPoints(hero.getHealthPoints()-(damageMin + chance));
    }

    public int getHp(){
        return hp;
    }
    public void setHp(int minus){
        hp -= minus;
    }
    public String getName(){
        return name;
    }
}
