package com.java.epam;

import  com.java.epam.command.*;
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
        ProfileController profileController = new ProfileController();
        profileController.showProfile(1);

    }
}
