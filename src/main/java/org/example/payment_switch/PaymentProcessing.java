package org.example.payment_switch;

public class PaymentProcessing {
    public static void main(String[] args){
        int PaymentTypeCode = 3;
         String PaymentType;

         switch (PaymentTypeCode){
             case 1:
                 PaymentType = "Credit";
                 break;
             case 2:
                 PaymentType = "Debit";
                 break;
             case 3:
                 PaymentType = "Paypal";
                 break;
             case 4:
                 PaymentType = "Apple Pay";
                 break;
             case 5:
                 PaymentType = "Google pay";
                 break;
             default:
                 PaymentType = "Unknown";

         }
         System.out.println("Parment Type Code: " + PaymentTypeCode);
         System.out.println("Payment Method: " + PaymentType);
    }
}
