package org.example.collections.hashSet;

import java.util.HashSet;
import java.util.Set;

public class MenuApp {
    public static void main(String[] args){
        Set<EntryRegister> register = new HashSet<>();// defining set

        EntryRegister register1 = new EntryRegister();//  creating  first object
        register1.setName("jae");
        register1.setCity("newyork");

        EntryRegister register2 = new EntryRegister();
        register2.setName("john");
        register2.setCity("Dallas");

        register.add(register1);
        register.add(register2);

        System.out.println(register);
        System.out.println(register1);

        for (EntryRegister entry : register){
            System.out.println("Name: " + entry.getName() + "    city: " + entry.getCity());
        }


    }
}
