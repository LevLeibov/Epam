package com.java.epam.profile;

import com.java.epam.common.Canvas;

public class ConsoleCanvas extends Canvas {
    private char[][] pixies;
    private int height;
    private int width;

    public ConsoleCanvas(int height, int width){
        this.height = height;
        this.width = width;
        init();
        draw();




    }

    public void init(){
        pixies = new char[height][width];
        reset();


    }

    private void reset(){
        for (int i = 0; i<height; i++) {
            for (int j = 0; j<width; j++) {
                pixies[i][j] = '.';


            }
        }
        //setSymbol(2,1, 'w');
        drawSq(1, 2, 5);
    }

    private void draw(){
        for (int i = 0; i<height; i++) {
            System.out.print("\n");
            for (int j = 0; j<width; j++) {
                System.out.print(pixies[i][j]);

            }
        }
    }
    public void drawSq(int x, int y, int l){
        for (int i = x; i<=x+l; i++) {
            for (int j = y; j <= y+l; j++) {
                pixies[i][j] = '#';
            }
        }
    }

    public void setSymbol(int x, int y, char symbol){
        pixies[x][y] = symbol;
    }


    @Override
    public void drawText(String text) {
        System.out.println(text);
    }

    @Override
    public void drawSquare(int size) {
        if (size < 2) {
            System.out.println("No square of such size allowed");
        }
        System.out.print("\n");
        for (int i = 0; i < size; i++) {
            System.out.print("#");
        }

        for (int i = 0; i < size - 1; i++) {
            System.out.print("");
        }
    }
}
