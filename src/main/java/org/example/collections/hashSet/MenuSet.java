package org.example.collections.hashSet;


import java.util.HashSet;
import java.util.Set;

public class MenuSet {
    public static void main(String[] args){
        Set<RestaurantMenu> menuSet = new HashSet<>();
        // add items
        menuSet.add(new RestaurantMenu("Tea"));
        menuSet.add(new RestaurantMenu("Black Tea"));
        menuSet.add(new RestaurantMenu("Boba"));
        menuSet.add(new RestaurantMenu("Green Tea"));
        menuSet.add(new RestaurantMenu("Tea")); //Duplicate won't accept

        //print all items
        System.out.println("Menu Items:");;
        for(RestaurantMenu item : menuSet){
            System.out.println("- "+ item);
        }

        //check if item exists
        System.out.println("\nContains Boba ?"+ menuSet.contains(new RestaurantMenu("Boba")));

        //Remove an item
        menuSet.remove(new RestaurantMenu("Black Tea"));
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
