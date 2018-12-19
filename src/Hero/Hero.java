package Hero;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Hero {
    final Random random = new Random();
    Scanner sc = new Scanner(System.in);
    private int strange;
    private int perception;
    private int endurance;
    private int charisma;
    private int intelligence;
    private int agility;
    private int luck;
    private int[] special;
    private int lvl;

    private static final int MAX_COUNT = 10;
    private static final int MIN_COUNT = 1;
    private String heroName;
    private boolean sex;
    private int age;
    private int points;
    private int healthPoints;
    private int actionPoints;
    private int damageMiliMin;
    private int damageMiliMax;
    private int damageRangeMin;
    private int damageRangeMax;

    public Hero() {
        Scanner sc = new Scanner(System.in);
        this.lvl = 0;
        special = new int[7];

        this.actionPoints = 6;
        this.points = 10;
        this.strange = 5;
        this.perception = 5;
        this.endurance = 5;
        this.charisma = 5;
        this.intelligence = 5;
        this.agility = 5;
        this.luck = 5;
        this.healthPoints = 15 + strange*2;
        special[0] = this.strange;
        special[1] = this.perception;
        special[2] = this.endurance;
        special[3] = this.charisma;
        special[4] = this.intelligence;
        special[5] = this.agility;
        special[6] = this.luck;
        this.damageRangeMin = 7;
        this.damageRangeMax = 15;
        this.damageMiliMin = 2 + strange;
        this.damageMiliMax = 5 + strange;
        System.out.println("Введите имя вашего персонажа");
        this.heroName = sc.nextLine();
        System.out.println("Выберите пол персонажа");
        System.out.println("1 - Мужской");
        System.out.println("0 - Женский");
        int bufSex = sc.nextInt();
        if (bufSex == 1) {
            this.sex = true;
        } else if (bufSex == 0) {
            this.sex = false;
        }
        System.out.println("Введите возраст персонажа без пробелов");
        this.age = sc.nextInt();
        setCharacteristics();

    }

    public void getCharacteristics() {
        setStrange(special[0]);
        setPerception(special[1]);
        setEndurance(special[2]);
        setCharisma(special[3]);
        setIntelligence(special[4]);
        setAgility(special[5]);
        setLuck(special[6]);
        System.out.println("Ваши текущие характеристики");
        System.out.println("№1 Ваша сила = " + getStrange());
        System.out.println("№2 Ваше восприятие = " + getPerception());
        System.out.println("№3 Ваша выносливость = " + getEndurance());
        System.out.println("№4 Ваша харзима = " + getCharisma());
        System.out.println("№5 Ваш интеллект = " + getIntelligence());
        System.out.println("№6 Ваша ловкость = " + getAgility());
        System.out.println("№7 Ваша удача = " + getLuck());
    }

    public void chekOnPoints(int characteristic) {
        characteristic-=1;
        System.out.println("Что вы хотите сделать? (Увлеичить +X, уменьшить -X, где X это целое число <10");
        String changes = sc.next();
        String[] symbols = changes.split("");
        switch(symbols[0]) {
            case "+":
                if ((special[characteristic] + Integer.parseInt(symbols[1]) > MAX_COUNT || getPoints() - Integer.parseInt(symbols[1]) < 0)) {
                    throw new IllegalArgumentException("У тебя не достаточно баллов улучшения! или Характеристика больше 10!");
                }
                special[characteristic] = special[characteristic] +  Integer.parseInt(symbols[1]);
                setPoints(getPoints() - Integer.parseInt(symbols[1]));
                break;
            case "-":
                if (special[characteristic] - Integer.parseInt(symbols[1]) < MIN_COUNT || getPoints() + Integer.parseInt(symbols[1]) > MAX_COUNT) {
                    throw new IllegalArgumentException("У тебя слишком много баллов для улучшения! или Характеристику сделать меньше нельзя!");
                }
                special[characteristic] = special[characteristic] - Integer.parseInt(symbols[1]);
                setPoints(getPoints() + Integer.parseInt(symbols[1]));
                break;
        }
    }


    public void setCharacteristics() {
        getCharacteristics();
        boolean on = true;
        System.out.println("Свободные очки прокачки = " + getPoints());
        while (on) {
            while (getPoints() > 0) {
                System.out.println("Введите номер характеристики которую вы хотите изменить");
                int resetCharacterisic = sc.nextInt();
                chekOnPoints(resetCharacterisic);
                getCharacteristics();
                System.out.println("Ваши свободные очки = " + getPoints());
            }
            getCharacteristics();

            System.out.println("Вы хотите закончить распределение очков? 1 - да, 2 - нет");
            int x = sc.nextInt();
            if(x==1){
                on = false;
            }
        }

    }


    public int attack(){
        System.out.println("Чем вы хотите атаковать?");
        System.out.println("1 - Боевой нож");
        System.out.println("2 - 10мм Пистолет");
        int number = sc.nextInt();
        int chance;
        int plusDamage;
        if(number==1){
            plusDamage = random.nextInt(damageMiliMax-damageMiliMin);
            chance = random.nextInt(100);
            if(chance>80){
                System.out.println("Критический удар!");
                return damageMiliMax + 5;
            }
            return damageMiliMin + plusDamage;
        }
        else if (number==2){
            plusDamage = random.nextInt(damageRangeMax-damageMiliMin);
            chance = random.nextInt(100);
            if(chance>80){
                System.out.println("Критический удар!");
                return damageRangeMax*2;
            }
            return damageRangeMin+plusDamage;
        }
        return 0;
    }
    public String getHeroName(){
        return heroName;
    }

    public int getStrange() {
        return strange;
    }

    public void setStrange(int strange) {
        this.strange = strange;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getPerception() {
        return perception;
    }

    public void setPerception(int perception) {
        this.perception = perception;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getActionPoints() {
        return actionPoints;
    }

    public void setActionPoints(int actionPoints) {
        this.actionPoints = actionPoints;
    }
}
