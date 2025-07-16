package org.example.oopsConcept.abstraction;

public class Debit extends Card {
    @Override
    void processPayment() {
        System.out.println("Processing payment using Debit Card.");
    }
}
