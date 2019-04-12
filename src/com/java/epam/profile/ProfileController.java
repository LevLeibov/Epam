package com.java.epam.profile;

public class ProfileController {
    private ProfileModel model;
    private ProfileView view;
    public void showProfile(int id){
        ProfileView view = new ProfileView();
        ProfileModel model = new ProfileModel();
        model.setFirstname("fname");
        model.setLastname("last");
        model.setId(0);
        view.setModel(model);
        view.draw();
    }
}
