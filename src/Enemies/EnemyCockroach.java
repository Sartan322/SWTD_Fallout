package Enemies;

import Hero.Hero;


public class EnemyCockroach extends Enemy {

    public EnemyCockroach(String name, Hero hero) {
        super(name, hero);
        this.hp = 30;
        this.damageMin = 2;
        this.damageMax = 15;
    }

}
