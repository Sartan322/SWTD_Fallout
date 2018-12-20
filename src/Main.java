import Events.FirstEvent;
import Events.ThirdEvent;
import Hero.Hero;
import Logical.Event;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        boolean life = true;
        StartOfGame sg = new StartOfGame();
        //sg.history();
        Hero hero = new Hero();
        FirstEvent first = new FirstEvent(hero);
        ThirdEvent third = new ThirdEvent(hero);
        first.history();
        if(life){
            life = first.react();
        }
        if(life){
            first.history();
            life = third.react();
        }

    }
}
