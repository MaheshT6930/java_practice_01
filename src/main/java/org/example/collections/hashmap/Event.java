package org.example.collections.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Event {
    public static void main(String[] args) {
        List<String> stalls = new ArrayList<>();
        stalls.add("stall1");
        stalls.add("stall2");

        List<String> food = new ArrayList<>();
        food.add("lunch menu");
        food.add("Dinner menu");

        Map<String,List<String >> eventInfo = new HashMap<>();
        eventInfo.put("Key 1", stalls);
        eventInfo.put("Key 2", food);

        System.out.println(eventInfo);

        for(Map.Entry<String, List<String>> myEntry : eventInfo.entrySet()){
            if (myEntry.getKey().equalsIgnoreCase("Key 2")){
                eventInfo.get(myEntry.getKey()).add("Breakfast");
            }
            for(String item : myEntry.getValue()){
                System.out.println(item);

            }
        }


    }

}
