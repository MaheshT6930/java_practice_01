package org.example.jumpStatements;

public class PaymentTypeCheck {
    public static void main(String[] args) {
        // Integer array of payment type codes
        Integer[] paymentTypes = {1,2,3,4,5,6,7,8};

        for (int type : paymentTypes) {
            // If it's a valid type (1 to 5), skip it
            if (type <= 5 ) {
                continue;
            }

            // Else print the invalid payment type
            System.out.println("Invalid payment type code: " + type);
        }
    }
}
