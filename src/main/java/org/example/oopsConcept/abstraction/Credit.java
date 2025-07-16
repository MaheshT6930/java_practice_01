package org.example.oopsConcept.abstraction;

public class Credit extends Card{
    @Override
    void processPayment() {
        System.out.println("Processing payment using Credit Card.");
    }
}
