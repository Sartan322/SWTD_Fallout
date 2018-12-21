import Events.*;
import Hero.Hero;
import Logical.Event;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        boolean life = true;
        StartOfGame sg = new StartOfGame();
        Hero hero = new Hero();
        sg.history();
        FirstEvent first = new FirstEvent(hero);
        first.history();
        first.react();
        SecondEvent second = new SecondEvent(hero);
        if (life) {
            second.history();
            second.react();
        }
        ThirdEvent third = new ThirdEvent(hero);
       if (life) {
           third.history();
           third.react();
       }
        FourthEvent fourth = new FourthEvent(hero);
       if (life) {
           fourth.history();
           fourth.react();
       }
        FinalEvent finality = new FinalEvent();
       if (life) {
           finality.history();
           finality.react();
       }
    }
}
