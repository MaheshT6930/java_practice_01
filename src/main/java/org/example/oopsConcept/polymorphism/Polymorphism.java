package org.example.oopsConcept.polymorphism;

public class Polymorphism {
    public static void main(String[] args){

        Mutiplication maheshMultiplication = new Mutiplication();

        System.out.println("multiplication of numbers:"+ maheshMultiplication.multiplication(3, 4));
        System.out.println("multiplication of numbers:"+ maheshMultiplication.multiply(3.52,3, 3));
        System.out.println("multiplication of numbers:"+ maheshMultiplication.multiply_float(2.0F, 2.2F));
        System.out.println("multiplication of numbers:"+ maheshMultiplication.multiply(2,3,4));


    }
}
