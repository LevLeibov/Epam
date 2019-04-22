package com.java.epam.profile;

import com.java.epam.common.BaseModel;
import com.java.epam.common.BaseView;
import com.java.epam.common.Canvas;

import java.util.List;

/**
 * Prints criminal profile from model.
 */
public class ProfileView extends BaseView {
    public void setRecords(List<String> records) {
        this.records = records;
    }

    private List<String> records;



    public void draw(ConsoleCanvas consoleCanvas) {

        consoleCanvas.setSquareAt(0,65,15,false);
        consoleCanvas.setRectangleAt(9,68,9,5,true);
        for (int i=1; i<records.size();i++){
            consoleCanvas.setTextAt(0,i,records.get(i));}
        consoleCanvas.draw();

    }
}