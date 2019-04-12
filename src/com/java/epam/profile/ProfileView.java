package com.java.epam.profile;

import com.java.epam.common.BaseModel;
import com.java.epam.common.BaseView;

public class ProfileView extends BaseView {
    ProfileModel model;
    @Override
    public void draw(){
        System.out.println("Canvas profile");
        System.out.println("name" + model.getName());
    }

    @Override
    public void setModel(ProfileModel model) {
        super.setModel(model);
    }
    //+set id
}
