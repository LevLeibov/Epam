package com.java.epam;

import  com.java.epam.command.*;
import com.java.epam.profile.ConsoleCanvas;
import com.java.epam.profile.ProfileController;
import com.java.epam.profile.ProfileModel;
import com.java.epam.profile.ProfileView;

public class Application {
    static public final String AUTHOR = "Lev Leibov";
    static public final String VERSION = "0.0.0";

    public static void main(String[] args) {
        //String currentName = "version";
        //ACommand command = CommandRegistry.INSTANCE.getCommand(currentName);
        //command.execute();
        //ProfileView view = new ProfileView();

        //ProfileController profileController = new ProfileController();
        //profileController.showProfile(1);
        /*
        Runnable runnable1 = new Runnable() {
            @Override
            public void run(){
                for (int i = 0; i<10; i++) {
                    System.out.println("-");
                }
            }
        };
        Thread thread = new Thread() {
            @Override
            public void run(){
                for (int j = 0; j< 10; j++){
                    System.out.println(",");
                }

            }
        };
        (new Thread(runnable1)).start(); //---
        thread.start(); //,,,,
        */

        ConsoleCanvas new_canvas = new ConsoleCanvas(10,10);
    }
}
