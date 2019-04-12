package com.java.epam.common;


public class BaseView {
    protected BaseModel model;
    public void draw(){

        System.out.println("Draw view"); //перегрузка метода draw
    }
    public void draw(Canvas canvas){
        System.out.println("Draw" + canvas);
    }

    public void setModel(BaseModel model){
        this.model = model;
    }
}
