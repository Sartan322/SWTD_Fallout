package Events;

import Enemies.EnemyDog;
import Hero.Hero;

import java.sql.Time;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class FirstEvent  {
    Hero hero;

    public FirstEvent(Hero hero) {
        this.hero = hero;
    }

    public void history() throws InterruptedException {
        System.out.println("Эта чертова железная дверь не открывалась уже почти два столетия... Можно сравнить ее с протухшими консервами, хех, которые при открытии шипят и издают истонченный аромат.");
        TimeUnit.SECONDS.sleep(4);
        System.out.println("Пока эта жестянка открывалась, я собирался с мыслями и думал, что же делать дальше и где искать всех остальных? Почему остался только я?!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Свет, исходящий из \"небесной арки\", только что отворившейся, слепил глаза и можно было едва разглядеть что там, изнутри:");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("*кругом одним пески, все проросло кустами, на первый взгляд все выглядит как-то обычно, но слишком безлюдно*");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Делать нечего, ты остался один и придется выходить на поиски остальных жителей убежища, иначе ты никак не проживешь дальше...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Что там дальше, за горизонтом? Ах, чёрт его знает! Еще ни разу, из тех, кто выходил из убещижа, хоть раз возвращался обратно :)");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Слишком теплый грунт под ногами, *думаю среднесуточная температура земной коры повысилась за последние полвека процентов эдак на 200% из-за последствий ядерной атаки*,");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("каково это, находиться снаружи?.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Так! Главное не думать об этом! Все, мысли прочь. Нужно заняться делом, попробую сделать пару выстрелов из пистолета, вдруг кто по близости и они смогут дать мне сигнал!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("***Достает оружие из кабуры***");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(" ***Заряжает в магазин 7 патрон***");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("***Снимает предохранитель***");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("***Выстрел № 1***");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("***Выстрел № 2***");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("***Выстрел № 3***");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Эх... Тишина, ладно, разряжу магазин и пойду дальше.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("***Выстрел № 4***");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Фух!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("***Выстрел № 5***");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("*у-ууу-ууууу(как вой оборотня)*");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Ух ты ж, это еще что? Пойду на звук, вдруг это даст мне наводку на то, куда идти мне дальше и что мне делать!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("!* 6 минут спустя:");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("*на песке следы 3-ех странных лап с 3 пальцами, словно черепашки-ниндзя!*");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("*На расстоянии метров 50-70-ти отчетливо слышны вой и рычание* ==> *Сердце стало колотиться в 4 раза быстрее, словно я выпил 7 банок Red Bull'a за раз*");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Откуда невозьмись, из-за чащи выбегает 3 собаки, они явно нацелены напасть на тебя!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Твои действия?:");
        TimeUnit.SECONDS.sleep(2);
    }

    public boolean react() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Напасть на стаю");
        System.out.println("2. Попытаться притовриться безжизненным и замереть");
        if (hero.getPerception() > 7) {
            System.out.println("3. Бесшумно уйти назад");
        }
        if (hero.getAgility() > 7) {
            System.out.println("4. Попытаться растолкать собак");
        }
        System.out.println("Введи номер команды");
        String NummberOfCommand = sc.next();
        switch (NummberOfCommand) {
            case "1":
                return this.firstSituation();
            case "2":
                this.secondSituation();
                return true;
            case "3":
                this.extraSituation();
                return true;
            case"4":
                this.secondExtraSituation();
                return true;
        }
        return true;
    }

    private void extraSituation() throws InterruptedException {   // когда вопсриятие больше 7
        System.out.println("Ты пятишься назад и упираешься в скалу");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Вожак стаи кусает тебя за руку");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Но ты не растерялся и вспомнил, что прихватил с собой нож");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Ранив вожака, другие собаки не стали нападать на тебя. Вожак тоже стоит и ждет твоих действий");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Ты решаешь развернуться и уйти в другую сторону");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("*В этой ситуации ты потерял 5 очков здоровья, но получаешь 1 очка для улучшений параметров Special.");
        hero.setHealthPoints(hero.getHealthPoints() - 5);
        hero.setPoints(hero.getPoints() + 1);
        hero.setCharacteristics();
    }

    private void secondExtraSituation() throws InterruptedException { // если ловкость больше 7
        System.out.println("Ты попытался растолкать собак и убежать");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Стая бежит за тобой");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("*Ты слышишь вой волков*");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Вожак собак остановился, прислушился");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Простояв пару секунд, собаки убегают впрочь");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("*В этой ситуации ты получаешь 1 очка для улучшений параметров Special.");
        hero.setPoints(hero.getPoints() + 1);
        hero.setCharacteristics();
    }

    private boolean firstSituation() throws InterruptedException { //варик, если ты решишь напасть на них
        int heroHealthBuf = hero.getHealthPoints();
        System.out.println("Ты уверенной походкой устремляешься на вожака стаи");
        EnemyDog dog = new EnemyDog("Вожак", hero);
        while (dog.getHp()>0 && hero.getHealthPoints()>0) {
            dog.setHp(hero.attack());
            if (dog.getHp()<=0){
                System.out.println("" + dog.getName() + "умирает");
                break;
            }
            dog.attack();
            if (hero.getHealthPoints() <= 0){
                System.out.println("*ВЫ УМЕРЛИ*");
                return false;
            }
        }
        System.out.println("В ходе долгой битвы тебе удается победить вожака стаи. Остальные собаки поджав хвосты убегают.");
        TimeUnit.SECONDS.sleep(2);
        heroHealthBuf -= hero.getHealthPoints();
        System.out.println("*В этой ситуации ты потерял" + heroHealthBuf + " очков здоровья, но получаешь 1 очко для улучшений параметров Special.");
        hero.setPoints(hero.getPoints() + 1);
        hero.setCharacteristics();
        return true;
    }

    private void secondSituation() throws InterruptedException { // если вариант попытаться пртитвориться неживым существом
        System.out.println("Ты задержал дыхание, перестал шевелить глазами. Ты замер");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Вожак стаи уже в 5 метрах от тебя");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Ты чувствуешь как у тебя усилилось сердцебиение, ты буквально слышишь каждый удар");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Вдруг вы все слышите громкий вой собак");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Простояв пару секунд, собаки убегают впрочь");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Наверное, это оказался самый разумный выбор, за это ты получаешь 2 очков улучшений");
        hero.setPoints(hero.getPoints() + 2);
        hero.setCharacteristics();
    }
}
