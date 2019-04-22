package com.java.epam.db;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DataBase {

    Object tablelock = new Object();
    // замок, при закрытии которого может работать только один поток.
    // Остальные потоки, использующие synchronized (объект) как замок, работать не будут
    // (на время исполнения куска кода в юлоке synchronized, закрывший замок)
    // synchronized(this) запирает все остальные потоки
    // можно еще запереть методы, а не участки кода

    Map<String, Table> tables;

    public List<Record> select(){  // synchronized запирает поток
        System.out.println("Starting fetching methods");
        synchronized (tablelock){ // замок
            try{
                Thread.sleep(500);
                System.out.println("Finished fetching methods");

            }catch (InterruptedException e) {
            }
        }
        return null;
    }
    public void update(){
        System.out.println("Starting updating db");
        synchronized (tablelock) {
            try {
                Thread.sleep(10000);
                System.out.println("Finished updating");

            } catch (InterruptedException e) {

            }
        }
        //return null;

    }


    public static List<String> readDataFile(String fieldName) {
        FileInputStream fis = null;
        List<String> result = new ArrayList<String>();
        BufferedReader br;
        try {
            fis = new FileInputStream(fieldName);
            br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine()) != null) {
                result.add(line);
            }
        } catch (FileNotFoundException fnfe) {

        } catch (IOException ioex) {

        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public void delete() {

    }





    public void insert(Record record, Table table) {

    }


}