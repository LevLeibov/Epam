package com.java.epam.db;

import java.util.List;

public abstract class Table {
    protected String name;
    protected List<Record> columns;
    protected List<String> values;
    protected List<Record> records;
    {

    }
    public Table(String name, List<String> columns){
        this.name = name;
        //this.columns = columns;
    }
    //public void insert()
}
