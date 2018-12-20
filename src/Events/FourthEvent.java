package Events;

import Enemies.Enemy;
import Enemies.EnemyCockroach;
import Enemies.EnemyRaider;
import Hero.Hero;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class FourthEvent {
    Hero hero;

    public FourthEvent(Hero hero) {
        this.hero = hero;
    }

    public void history() throws InterruptedException {
        System.out.println("*Солнце встало, светит через окошко в глаза*");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("-Ух, переночевал, почти полностью заряжен энергией на целый день поисков, лишь перекусить.");
        TimeUnit.SECONDS.sleep(4);
        System.out.println("Ах, я вчера же видел припасы, а у меня и нож с собой.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("*Подошел к ящику с тушенкой*");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Надеюсь эта не кола, которую мы постоянно пьем в убежище!");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("*Взял жестяную банку в руки: на этикетке \"БаранOFF\"*");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Явно это тушенка!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("*Достал свой нож, открыл банку и принялся ножом ковырять кусочки мяса и трапезничать*");
        TimeUnit.SECONDS.sleep(4);
        System.out.println("*Ррр-ы-ыЫГЫ(Отрыжка)*");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Было приятно погостить, хех! Пора выдвигаться дальше, пойду дальше, может опять и знак кто укажет.");
        TimeUnit.SECONDS.sleep(4);
        System.out.println("Выйдя на улицу, ты видишь тот самый красный клубок ниток, от которого ушел вчера. Он прыгает, как бы намекая, что нужно идти за ним!");
        TimeUnit.SECONDS.sleep(4);
        System.out.println("Один раз я отказался и не пошел за ним, и, думаю это было ошибкой. Пожалуй, соглашусь и пойду следом за ним.");
        TimeUnit.SECONDS.sleep(4);
        System.out.println("*прошло полдня нудной ходьбы:");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Мы набрели на какой-то странный, ветхий мост.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Нужно обратиться к своему Pip-Boy 2000 и навести справку:");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("*включает Pip-Boy'a*");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("*вбивает координаты локации, в соответсвии с компасом*");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("*Голосом робота с долей скрежета*");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Перед вами - мост смерти.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("На этом месте погибли 7 выходцев из убежища 807, которые и раньше отправлялись на разведку или же в поисках каких-либо богатств");
        TimeUnit.SECONDS.sleep(4);
        System.out.println("Вам предложено на выбор несколько вариантов, как миновать эту опасность:");
        TimeUnit.SECONDS.sleep(2);
    }

    public boolean react() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Попытаться с максимальной осторожностю перейти мост");
        System.out.println("2. Попробовать найти обход");
        if (hero.getAgility() > 8) {
            System.out.println("3. Максимально быстро перебежать мост");
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
        }
        return true;
    }

    private boolean firstSituation() throws InterruptedException { // если выбрал попытать счастье и пойти через мост
        int heroHealthBuf = hero.getHealthPoints();
        System.out.println("Ты робко осматриваешь ветхий мост");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Но все равно решаешься пойти по нему");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Зайдя на мост, ты слышишь, как дощечки скрипят под твоим весом");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("*Ты делаешь первый шаг*");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("*Второй шаг*");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Ты уже готов не дышать, лишь бы с этим мостом ничего не произошло");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Но, удача сегодня не на твоей стороне");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Одна из дощечек ломается, ты пытаешься ухватиться за перила");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Перила тоже ломаются");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Ты пытаешься уцепиться за выступ в скале");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("У тебя это получилось");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Ты, переведя дух, и успокоившись, начинаешь по скале слазить вниз");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("*Прошло 20 минут*");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("На дне каньона ты обнаруживаешь РадТаракана");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("У тебя не остается выбора и тебе придется сражаться с ним");
        this.fightWithCockroach();
        System.out.println("Тебе удалось победить это насекомое!");
        TimeUnit.SECONDS.sleep(2);
        heroHealthBuf -= hero.getHealthPoints();
        System.out.println("*В этой ситуации ты потерял " + heroHealthBuf + " очков здоровья, у тебя осталось " + hero.getHealthPoints() + " жизней и ты получаешь 1 очко для улучшений параметров Special.");
        hero.setPoints(hero.getPoints() + 1);
        hero.setCharacteristics();
        return true;
    }

    private boolean fightWithCockroach() {
        EnemyCockroach cockroach = new EnemyCockroach("РадТаракан", hero);
        while (cockroach.getHp()>0 && hero.getHealthPoints()>0) {
            cockroach.setHp(hero.attack());
            if (cockroach.getHp()<=0){
                System.out.println(" " + cockroach.getName() + " " + "умирает");
                break;
            }
            cockroach.attack();
            if (hero.getHealthPoints() <= 0){
                System.out.println("*ВЫ УМЕРЛИ*");
                return false;
            }
        }
        return true;
    }

    private boolean secondSituation() throws InterruptedException { //если выбрал попробовать найти обход моста
        int heroHealthBuf = hero.getHealthPoints();
        System.out.println("Ты оглядываешь местность");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("И видишь в далеке, почти на мираже виднеется конец этого каньона");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Ты устремляешься к этому месту");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("*Ты бежишь 5 минут*");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("*10 минут*");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("*20 минут*");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("*40 минут*");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Ты оказался без сил, жара слишком вымотала тебя");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Ты присел отдохнуть");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Как вдруг, как будто из пустоты, перед тобой появился Райдер");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Он настроен очень серьезно, и уже навел на тебя свою пушку");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Но ты тоже не промах, и уже готовишься к битве...");
        this.fightWithRaider();
        System.out.println("Да! Райдер повержен");
        TimeUnit.SECONDS.sleep(2);
        heroHealthBuf -= hero.getHealthPoints();
        System.out.println("*В этой ситуации ты потерял " + heroHealthBuf + " очков здоровья, у тебя осталось " + hero.getHealthPoints() + " жизней и ты получаешь 1 очко для улучшений параметров Special.");
        hero.setPoints(hero.getPoints() + 1);
        hero.setCharacteristics();
        System.out.println("Даа... кажется этот бой тебя совсем вымотал");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Ты еле стоишь на ногах");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("*У тебя темнеет в глазах*");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("*Ты падаешь*");
        return true;
    }

    private boolean fightWithRaider() {
        EnemyRaider raider = new EnemyRaider("Райдер", hero);
        while (raider.getHp()>0 && hero.getHealthPoints()>0) {
            raider.setHp(hero.attack());
            if (raider.getHp()<=0){
                System.out.println(" " + raider.getName() + " " + "умирает");
                break;
            }
            raider.attack();
            if (hero.getHealthPoints() <= 0){
                System.out.println("*ВЫ УМЕРЛИ* ");
                return false;
            }
        }
        return true;
    }

    private boolean thirdSituation() throws InterruptedException { // если у тебя ловкость >8 способность бысто перебежать мост
        System.out.println("Хм.., впринципе не плохая идея");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("*Ты берешь разбег*");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("*3*");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("*2*");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("*1*");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Ты бежишь на максимуме своих характеристик");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Тебе все же получается перепрыгнуть мост");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Но, ты получил растяжение ноги");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("*И теряешь 2 очка здоровья*");
        hero.setHealthPoints(hero.getHealthPoints() - 2);
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Теперь у тебя " + hero.getHealthPoints() + " очков здоровья");
        return true;
    }
}
