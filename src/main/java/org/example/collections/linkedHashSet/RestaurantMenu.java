package org.example.collections.linkedHashSet;

import java.util.Objects;


public class RestaurantMenu {
    String item;


    public RestaurantMenu(String item){
        this.item = item;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof RestaurantMenu))
            return false;
        RestaurantMenu menu = (RestaurantMenu) obj;
        return item.equalsIgnoreCase(menu.item);
    }

    public  int hashcode(){
        return Objects.hash(item.toLowerCase());
    }

    public String toString(){
        return item;
    }
}
