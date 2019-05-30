package com.java.steve.command;

import static com.java.steve.Application.VERSION;

public class CommandVersion extends ACommand{
    CommandVersion (String name){
        super(name);
    }

    @Override
    public void execute() {
        System.out.println("Version: " + VERSION);
    }
}

