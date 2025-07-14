package org.example.casting;



public class Main {
    public static void main(String[] args) {
        // 1. Int to Double
        int num = 25;
        double convertedDouble = (double) num;
        System.out.println("Integer value: " + num);
        System.out.println("Double value: " + convertedDouble);
        System.out.println();

        //1.A Int to Float
        int num1 = 33;
        Float convertedFloat =  (float) num1;
        double con_dou = (double) num1;
        System.out.println("interger: " + num1);
        System.out.println("Float number: " + convertedFloat);
        System.out.println("Double Value: " + con_dou);
        System.out.println();


        // 2. Double to Int
        double value = 45.78;
        int convertedInt = (int) value;
        System.out.println("Double value: " + value);
        System.out.println("Integer value (after casting): " + convertedInt);
        System.out.println();

        // 3. Char to String
        char letter = 'A';
        String letterAsString = String.valueOf(letter);
        System.out.println("Char value: " + letter);
        System.out.println("String value: " + letterAsString);
        System.out.println();

        // 4. String to Char
        String text = "Hello";
        char firstChar = text.charAt(0);
        System.out.println("String value: " + text);
        System.out.println("First character: " + firstChar);
    }
}