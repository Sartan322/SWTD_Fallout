package Logical;

import Commands.CommandImpl;

public class Event {
    private int countOfCommand;
    CommandImpl[] commands;

    public Event(int countOfCommand, CommandImpl[] commands) {
        this.countOfCommand = countOfCommand;
        this.commands = new CommandImpl[countOfCommand];
    }

    public void getCommand() {
        for (int i = 0; i < countOfCommand; i++) {
            System.out.println(i + commands[i].getCommand());
        }
    }
}
