package com.java.epam.command;

import static com.java.epam.Application.VERSION;

public class CommandVersion extends ACommand{
    CommandVersion (String name){
        super(name);
    }

    @Override
    public void execute() {
        System.out.println("Version: " + VERSION);
    }
}
