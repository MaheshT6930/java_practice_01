package org.example.jumpStatements;

public class NameChecker {
    public static void main(String[] args) {
        String[] names = {"Alice", "varma", "Charlie", "Ravi", "David"};

        for (String name : names) {
            if (name.startsWith("R") || name.startsWith("r")) {
                break; // stop the loop if name starts with R

            }
            System.out.println("Name: " + name);
        }

    }
}