package org.example.oopsConcept.abstraction;

public class Demo {
    public static void main(String[] args) {
        Card myCard1 = new Credit(); // Polymorphism
        Card myCard2 = new Debit();

        myCard1.processPayment(); // Output: Processing payment using Credit Card.
        myCard2.processPayment(); // Output: Processing payment using Debit Card.
    }
}
