package org.example.scanner;

// import scanner package for user input

import java.util.Scanner;
public class scanner {
    public static void main(String[] args) {
        // Creating an object of Scanner class
        Scanner sc = new Scanner(System.in);

        // Reading two Integer numbers
        // using nextInt() method
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.println("Third number is:  ");
        int num3 = sc.nextInt();

        // Calculating the sum
        int sum = num1 + num2;
        int product = num3*sum;


        // Printing the su
        System.out.println("The sum of the two numbers is: " + sum);
        System.out.println("product of two numbers: "+ product);
    }
}
