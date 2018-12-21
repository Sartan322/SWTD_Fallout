package Events;

import Enemies.EnemyPeasant;
import Enemies.EnemyRaider;
import Hero.Hero;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class SecondEvent {
    Hero hero;

    public SecondEvent(Hero hero) {
        this.hero = hero;
    }

    public void history() throws InterruptedException {
        System.out.println("Выйдя из всей этой передряги, ты направился дальше.");
        System.out.println("О, юный подаван!, тебя ждет большой и сложный путь, чтобы понять что случилось и где все твои друзья.");
        System.out.println("***(Голос из головы):" + hero.getHeroName() + "я вижу, что ты хочешь разобраться во всем этом! Следуй за красным клубком, который привидёт тебя к одной в хижине,\n" +
                "в которой ты сможешь найти ответы на некоторые вопросы, которые у тебя явно накопились за сегодняшнее утро. GL, HF, путник!");
        TimeUnit.SECONDS.sleep(4);
        System.out.println("Хм, идти за клубком! Думаю, из этого ничего хорошего не выйдет, но тем не менее, у меня больше нет вариантов! Летс ду ит.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Словно в мультике, откуда невозьмись, появился красный клубок ниток, спрыгнувший с небес и покатился кубарем вглубь леса.\n" +
                "Ничего не остается делать, как идти за ним.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("!* few moments later:");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Мы прошли почти 13 км, вдоль деревьев и кустов, которые не похожи на картинки из книг! Они совсем другие!\n" +
                "Жутко хочется пить...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("!* 13 минут спустя:");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Думаю, это было плохой затеей следовать за этим глупым клубком, который только и может катиться вперёд по заданному маршруту.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("*(мысли про себя)* А вдруг он просто издевается надо мной, и водит меня кругами? Остановлюсь-ка я, своим путём пойду!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("!* спустя еще over 100500 км:");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Да инде! Ну и забрел я, нужно попробовать найти помощь, попытка - не пытка!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Пройдя еще пару шагов, начали слышаться странные звуки: скрежет и крики!\n" +
                "-О, это точно люди! Возможно там у них поселение я смогу найти там помощь!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Пройдя через деревья, ты видишь такую картину:\n" +
                "Отряд крестьян защищается от нападков рейдеров на их поселение;");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Что будет делать?");
    }

    public boolean react() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Встать на сторону рейдеров. Кажется, что у них больше шансов победить");
        System.out.println("2. Сражаться за крестьян из благородных чувств");
        System.out.println("3. Не вмешиваться и пройти мимо  ");
        if (hero.getIntelligence() > 7) {
            System.out.println("4. Придумать план и используя силы крестьян попробовать побить рейдеров");
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
                this.thirdSituation();
                return true;
            case "4":
                this.extraSituation();
                return true;
        }
        return true;

    }
    private boolean firstSituation () throws InterruptedException {
        int heroHealthBuf = hero.getHealthPoints();
        System.out.println("Ты выбрал сторону рейдеров. Ты двигаешься в сторону защищающихся от крестьянинов рейдеров.");
        EnemyPeasant peasant = new EnemyPeasant("Крестьянин", hero);
        while (peasant.getHp() > 0 && hero.getHealthPoints() > 0) {
            peasant.setHp(hero.attack());
            if (peasant.getHp() <= 0) {
                System.out.println("" + peasant.getName() + "умирает");
                break;
            }
            peasant.attack();
            if (hero.getHealthPoints() <= 0) {
                System.out.println("*ВЫ УМЕРЛИ*");
                return false;
            }
        }
        System.out.println("В этой схватке ты побил нескольких крестьянинов. Победа осталась за рейдерами");
        TimeUnit.SECONDS.sleep(2);
        heroHealthBuf -= hero.getHealthPoints();
        System.out.println("*В этой ситуации ты потерял" + heroHealthBuf + " очков здоровья, но получаешь 1 очко для улучшений параметров Special.");
        hero.setPoints(hero.getPoints() + 1);
        hero.setCharacteristics();
        return true;

    }
    private boolean secondSituation() throws InterruptedException {

        int heroHealthBuf = hero.getHealthPoints();
        System.out.println("Ты выбрал сторону крестьянинов. Увидев схватку крестьянина и рейдера, ты решаешьБ что настало время вступить в бой.");
        EnemyRaider raider = new EnemyRaider("Рейдер", hero);
        while (raider.getHp() > 0 && hero.getHealthPoints() > 0) {
            raider.setHp(hero.attack());
            if (raider.getHp() <= 0) {
                System.out.println("" + raider.getName() + "умирает");
                break;
            }
            raider.attack();
            if (hero.getHealthPoints() <= 0) {
                System.out.println("*ВЫ УМЕРЛИ*");
                return false;
            }
        }
        System.out.println("Благодаря твоей помощи, Крестьяне смогли одолеть Рейдеров");
        TimeUnit.SECONDS.sleep(2);
        heroHealthBuf -= hero.getHealthPoints();
        System.out.println("*В этой ситуации ты потерял" + heroHealthBuf + " очков здоровья, но получаешь 1 очко для улучшений параметров Special.");
        hero.setPoints(hero.getPoints() + 1);
        hero.setCharacteristics();
        return true;
    }


    private void thirdSituation () throws InterruptedException { //
        System.out.println("Ты скрылся за деревьями в лесу, чтобы не быть вовлеченным в противостояние");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("В первый подходящий момент, ты сбегаешь как можно дальше от места боевых действий");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Наверное, это оказался самый разумный выбор, за это ты получаешь 2 очков улучшений");
        hero.setPoints(hero.getPoints() + 2);
        hero.setCharacteristics();
    }
    private void extraSituation () throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Решаешь, что нужно выпускать крестьянинов из убежища по мере их сокращения на поле боя");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Кажется, благодаря твоему плану ситуация крестьянинов улучшается.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("*В этой ситуации ты не теряешь очки здоровья, и получаешь 1 очка для улучшений параметров Special.");
        hero.setPoints(hero.getPoints() + 1);
        hero.setCharacteristics();

    }
}