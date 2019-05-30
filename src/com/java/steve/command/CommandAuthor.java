package com.java.steve.command;

import static com.java.steve.Application.AUTHOR;

public class CommandAuthor extends ACommand {
    CommandAuthor(String name){
        super(name);
    }

    @Override
    public void execute() {
        System.out.println("Author is "+ AUTHOR);
    }
}
