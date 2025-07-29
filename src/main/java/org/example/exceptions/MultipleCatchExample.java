package org.example.exceptions;

public class MultipleCatchExample {
    public static void main(String[] args){
        try{
            String text = null;
            System.out.println(text.length()); // thows null pointer exception
            int result = 10/0; // throws arthematic exception
            int[] numbers = new int[3];
            System.out.println(numbers[5]); // throws arraybindex of bounds exception

        }catch (NullPointerException e1){
            System.out.println("caught null pointer exception:" + e1);
        }catch (ArithmeticException e2){
            System.out.println("caught Arthimatic Exp:" + e2);
        }catch (ArrayIndexOutOfBoundsException e3){
            System.out.println("ArrayIndexOutOfBoundsException: " + e3);
        }
    }
}
