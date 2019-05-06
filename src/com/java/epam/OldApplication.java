package com.java.epam;

import  com.java.epam.command.*;

import com.java.epam.db.DBApplication;
import com.java.epam.profile.ConsoleCanvas;
import com.java.epam.profile.ProfileController;
import com.java.epam.profile.ProfileModel;
import com.java.epam.profile.ProfileView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OldApplication {
    static public final String AUTHOR = "Lev Leibov";
    static public final String VERSION = "0.0.0";

    public static void main(String[] args) {
        DBApplication.INSTANCE.start();
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

        //ConsoleCanvas new_canvas = new ConsoleCanvas(10,10);
        /*
        DataBase db = new DataBase();
        Thread thread1 = new Thread(){
            @Override
            public void run(){
                try{
                    Thread.sleep(500);
                    db.select();

                }catch (InterruptedException e){
                }

            }

        };
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                db.update();
            }
        };
        thread1.start();
        (new Thread(runnable)).start();

         */
        /*
        Table table = new Table("Criminals", Arrays.asList(new String[]{"id", "name", "deceased"});

        Record rec = new Record(table);
        rec.setValues(new String[]{"100", "A Soprano", false});
        try{
            System.out.println(rec.getInt("id"));
        }catch (Record.FieldNotFoundException ex){
            //System.out.println("Staktrace");
            ex.printStackTrace();
        }catch (NumberFormatException nfe){
            nfe.printStackTrace();
        }
        System.out.println("OK");

       //22.04___________

        final String ALLOWED_DOMAIN_NAMES = "^([a-zA-Z0-9]+\\.)*[a-zA-Z]$";

        final String OP_GROUP = "^(SELECT|DELETE)$";
        final String FLD_GROUP = "^([a-zA-Z, ]+)$";
        final String SPACE = "^([\\s]+)$";
        final String TSL_GROUP = "^([a-zA-Z]+)$";
        final String FROM_GROUP = "^([a-zA-Z]+)$";
        String query = "SELECT id, firstName, lastName FROM Criminals";

        Pattern p = Pattern.compile(OP_GROUP + SPACE + FLD_GROUP + SPACE + TSL_GROUP + SPACE + FROM_GROUP);
        Matcher matcher = p.matcher(query);

        if(matcher.find()){
            System.out.println("Number of groups" + matcher.groupCount());
            for(int i = 0, len = matcher.groupCount(); i<=len; i++){
                System.out.println("group" + i + matcher.group(i));
            }

        }

        List<String> list = new ArrayList<>();
        list.add("developer.apple.com");
        list.add("google.com");
        list.add("wrong.");





        //printlist(list, ALLOWED_DOMAIN_NAMES);
        //iteratorCleanUp(list, ALLOWED_DOMAIN_NAMES);

    }


    public static void printlist(List<String> list, String filter){
        for(String s : list){
            if(s.matches(filter)){
                System.out.println(s);
            }
        }
    }
    public static void foreachCleanUp(List<String> list, String filter){
        for(String s : list){
            if(!s.matches(filter)){
                list.remove(s);
            }
        }
    }

    public static void iteratorCleanUp(List<String> list, String filter){
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            if(!s.matches(filter)){
                list.remove(s);
            }


        }

         */


    }


}

