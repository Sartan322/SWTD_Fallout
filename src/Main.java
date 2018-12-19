import Events.FirstEvent;
import Hero.Hero;
import Logical.Event;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        boolean life = true;
        StartOfGame sg = new StartOfGame();
        sg.history();
        Hero hero = new Hero();
        FirstEvent first = new FirstEvent(hero);
        first.history();
        first.react();

    }
}
