package org.example.collections.hashmap;
import java.util.HashMap;
import java.util.Map;


public class HashmapExample {
        public static void main(String[] args) {
            //  Create HashMap
            Map<String, Double> menuMap = new HashMap<>();

            // Add items (put)
            menuMap.put("Tea", 2.5);
            menuMap.put("Black Tea", 3.0);
            menuMap.put("Boba", 4.0);
            menuMap.put("Green Tea", 3.5);

            // Print all menu items
            System.out.println("Menu with Prices:");
            for (Map.Entry<String, Double> entry : menuMap.entrySet()) {
                System.out.println(entry.getKey() + " - $" + entry.getValue());
            }

            System.out.println(menuMap.keySet());

            //  Get price of an item
            System.out.println("\nPrice of Boba: $" + menuMap.get("Boba"));

            //  Update price
            menuMap.put("Tea", 2.75);
            System.out.println("Updated price of Tea: $" + menuMap.get("Tea"));

            // Check if item exists
            System.out.println("Is Green Tea available? " + menuMap.containsKey("Green Tea"));

            // Remove an item
            menuMap.remove("Black Tea");
            System.out.println("After removing Black Tea: " + menuMap);

            // Size of menu
            System.out.println("Total items: " + menuMap.size());

            // Clear the menu
            menuMap.clear();
            System.out.println("Menu after clearing: " + menuMap);
        }


}
