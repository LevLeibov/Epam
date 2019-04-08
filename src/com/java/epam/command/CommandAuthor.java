package com.java.epam.command;

import static com.java.epam.Application.AUTHOR;

public class CommandAuthor extends ACommand {
    CommandAuthor(String name){
        super(name);
    }

    @Override
    public void execute() {
        System.out.println("Author is "+ AUTHOR);
    }
}