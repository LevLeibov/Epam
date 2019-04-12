package com.java.epam.profile;

import com.java.epam.common.BaseModel;

public class ProfileModel extends BaseModel {
    private int id;
    private String firstname;
    private String lastname;
    private boolean active;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    // alt + insert
    public void setId(int id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getName(){
        return firstname + lastname;
    }
}
