import Events.FirstEvent;
import Events.FourthEvent;
import Hero.Hero;
import Logical.Event;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        StartOfGame sg = new StartOfGame();
        Hero hero = new Hero();
        FirstEvent first = new FirstEvent(hero);
        FourthEvent fourth = new FourthEvent(hero);
        fourth.react();

    }
}
