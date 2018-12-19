package Events;

import Hero.Hero;

public class SecondEvent {
    Hero hero;

    public SecondEvent(Hero hero){this.hero = hero;}

    public void history(){
        System.out.println("Выйдя из всей этой передряги, ты направился дальше.");
        System.out.println("О, юный подаван!, тебя ждет большой и сложный путь, чтобы понять что случилось и где все твои друзья.");
        System.out.println("***(Голос из головы):" + hero.getHeroName() + "я вижу, что ты хочешь разобраться во всем этом! Следуй за красным клубком, который привидёт тебя к одной в хижине,\n" +
                "в которой ты сможешь найти ответы на некоторые вопросы, которые у тебя явно накопились за сегодняшнее утро. GL, HF, путник!");

    }
}
