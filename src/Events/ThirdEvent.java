package Events;

import Enemies.EnemyRobot;
import Hero.Hero;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ThirdEvent {
    Hero hero;
    Scanner sc = new Scanner(System.in);

    public ThirdEvent(Hero hero) {
        this.hero = hero;
    }

    public void history() throws InterruptedException {
        System.out.println("Все идет по линейке! Нужно было идти за этим гребаным клубком и всего этого не было бы!");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Никаких жертв мои глаза не видели бы! К чёрту все!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("***");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("(Голос из головы):");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("-" + hero.getHeroName() + ", я дал тебе возможность найти ответы на твои вопросы, но ты не воспользовался ей!");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Я вижу, что ты не отступил и идешь дальше!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("К счастью, ты совсем рядом с тем местом, куда я тебя хотел привести.");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("За кудыкины горы, воровать помидоры, эгэээй!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Вот, возьми этот компас, и следуй строго на юго-запад и набредешь на это место.");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Надеюсь, с этой штукой обращаться умеешь?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Вперёд!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("***");
        System.out.println("Следуя строго по направлению, ты изнемогая, почти пришел к месту.");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Но не тут то было! Ты слышишь странный шелест, не похожий на шелест деревьев.");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Что это? Обстановка накаляется к каждой 0.0001 милесекундой, сердце стучит, словно голодный дятел по дереву!");
        TimeUnit.SECONDS.sleep(4);
        System.out.println("ХА! Это черепашка, которая явно потерялась, надо взять ее с собой, вдруг еще пригодится!");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("***ожидание***");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("***ожидание***");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Вот мы и набрели на избушку.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("-Неловко заходить без приглашения! Пускай-ка Мартин(черепашка, которую мы нашли) заползёт первый!");
        TimeUnit.SECONDS.sleep(4);
        System.out.println("Пустив черепашку в щель приоткрытой двери, мы понимаем что внутри никого нет и можно спокойно заходить!");
        TimeUnit.SECONDS.sleep(4);
        System.out.println("Дома мы видим множетсво карт на стенах, запасы еды, которые мы обязательно берем с собой.");
        TimeUnit.SECONDS.sleep(4);
        System.out.println("*хрясть!*");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Дверь резко закрылась, перед глазами встал неисотвый робот, похожий на того робота, которым ты воспитывался в детстве в инкубаторе!");
        TimeUnit.SECONDS.sleep(4);
        System.out.println("Я BB-8, проект отряда Star Wars. Цель вашего визита?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Твои действия?:");
        TimeUnit.SECONDS.sleep(2);
    }

    public boolean react() throws InterruptedException {
        System.out.println("1 - Напасть на робота");
        if(hero.getIntelligence()>=7 && hero.getIntelligence() <=9){
            System.out.println("2 - Выстрелить в систему охлождения робота (ослабит робота)");
        }
        if(hero.getIntelligence()==100){
            System.out.println("3 - Взломать и перепрограммировать робота");
        }
        System.out.println("Введите номер команды:");
        String numberOfCommand = sc.next();
        switch (numberOfCommand){
            case "1":
                return firstSituation();
            case "2":
                return secondSituation();
            case "3":
                return thirdSituation();
        }
        return true;
    }
    private boolean firstSituation() throws InterruptedException {
        System.out.println("Робот входит в боевое состояние и начинается бой");
        int heroHealthBuf = hero.getHealthPoints();
        EnemyRobot robot = new EnemyRobot("BB-8", hero);
        while (robot.getHp()>0 && hero.getHealthPoints()>0){
            robot.setHp(hero.attack());
            if (robot.getHp()<=0){
                System.out.println("" + robot.getName() + "умирает");
                return true;
            }
            robot.attack();
            if (hero.getHealthPoints() <= 0){
                System.out.println("*ВЫ УМЕРЛИ*");
                return false;
            }
            TimeUnit.SECONDS.sleep(2);
            heroHealthBuf -= hero.getHealthPoints();
            System.out.println("*В этой ситуации ты потерял" + heroHealthBuf + " очков здоровья, но получаешь 1 очко для улучшений параметров Special.");
            hero.setPoints(hero.getPoints() + 1);
            hero.setCharacteristics();
            return true;
        }
        return true;
    }
    private boolean secondSituation() throws InterruptedException {
        int heroHealthBuf = hero.getHealthPoints();
        int fire = 1;
        System.out.println("Робот начал гореть и потихоньку начинают плавится микросхемы");
        EnemyRobot robot = new EnemyRobot("BB-8", hero);
        while (robot.getHp()>0 && hero.getHealthPoints()>0){
            robot.setHp(hero.attack());
            if (robot.getHp()<=0){
                System.out.println("" + robot.getName() + "умирает");
                return true;
            }
            robot.attack();
            if (hero.getHealthPoints() <= 0){
                System.out.println("*ВЫ УМЕРЛИ*");
                return false;
            }
            System.out.println("Робот из-за огня потерял - " + fire + " здоровья");
            robot.setHp(fire);
            fire++;
            TimeUnit.SECONDS.sleep(2);
            heroHealthBuf -= hero.getHealthPoints();
            System.out.println("*В этой ситуации ты потерял" + heroHealthBuf + " очков здоровья, но получаешь 1 очко для улучшений параметров Special.");
            hero.setPoints(hero.getPoints() + 1);
            hero.setCharacteristics();
            return true;
        }
        return true;
    }
    private boolean thirdSituation() throws InterruptedException {
        System.out.println("Вы начинаете взлом кода");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Резко включается система защиты и вам нужно выбрать правильный ответ");
        System.out.println("Что лучше?");
        System.out.println("1 - ИТИС");
        System.out.println("2 - ВМК");
        int choise = sc.nextInt();
        if(choise==1){
            System.out.println("Ответ правильный!");
            return true;
        }
        else{
            System.out.println("Ответ не правильный!");
            return firstSituation();
        }
    }
}
