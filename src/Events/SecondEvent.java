package Events;

import Hero.Hero;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class SecondEvent {
    Hero hero;

    public SecondEvent(Hero hero){this.hero = hero;}

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
                case"4":
                    this.extraSituation();
                    return true;
            }
            return true;
        }





        TimeUnit.SECONDS.sleep(2);
        System.out.println("");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("");
        TimeUnit.SECONDS.sleep(2);



    }
}
