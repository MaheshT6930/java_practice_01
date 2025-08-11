package org.example.collections.linkedHashSet;

//import org.example.collections.hashSet.RestaurantMenu;

import java.util.LinkedHashSet;
import java.util.Set;

public class MenuHashSet {
    public static void main(String[] args){
        Set<RestaurantMenu> menuSet = new LinkedHashSet<>();
        // add items
        //menuSet.add(new RestaurantMenu("Tea"));
        menuSet.add(new RestaurantMenu("Black Tea"));
        menuSet.add(new RestaurantMenu("Boba"));
        menuSet.add(new RestaurantMenu("Green Tea"));
        //menuSet.add(new RestaurantMenu("Tea"));//Duplicate won't accept

        RestaurantMenu maheshMenu = new RestaurantMenu("Tea");
        menuSet.add(maheshMenu);
        menuSet.add(maheshMenu);

        System.out.println();



        // Display in insertion order
        System.out.println("menu in insertion order");
        for (RestaurantMenu menu : menuSet){
            System.out.println("- " + menu);
        }


        //check if item exists
        System.out.println("\nContains Boba ?"+ menuSet.contains(maheshMenu));

        //Remove an item
        menuSet.remove(maheshMenu);
        System.out.println("\nAfter removing Black Tea:" + menuSet);

        //Get size
        System.out.println("Total items: " + menuSet.size());

        //check if empty
        System.out.println("is menu empty?"+ menuSet.isEmpty());

        // clear all
        menuSet.clear();
        System.out.println("After clearing: " + menuSet);
    }
}
