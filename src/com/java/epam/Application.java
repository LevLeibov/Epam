package com.java.epam;

import  com.java.epam.command.*;

public class Application {
    static public final String AUTHOR = "Lev Leibov";
    static public final String VERSION = "0.0.0";

    public static void main(String[] args) {
        String currentName = "version";
        ACommand command = CommandRegistry.INSTANCE.getCommand(currentName);
        command.execute();
    }
}
