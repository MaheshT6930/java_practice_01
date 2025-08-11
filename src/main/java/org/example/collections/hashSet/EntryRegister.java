package org.example.collections.hashSet;

import java.util.Set;

public class EntryRegister {
    private String name;
    private String city;

    public EntryRegister(String name, String city){
        this.name = name;
        this.city = city;
    }

    public EntryRegister(){
        //Default constructor
    }

    public String getName(){
        return name;
    }

    public String getCity(){
        return  city;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setCity(String city){
        this.city = city;
    }





}
