package org.example.multithreading;

import java.util.List;

public class SendGreetings extends Thread {

    List<Customer> customerList;
    String name;

    public SendGreetings(){

    }

    public SendGreetings(String name, List<Customer> customerList){
        this.name = name;
        this.customerList = customerList;
    }
    @Override
    public void run() {
        if (name.equalsIgnoreCase("email")) {
            sendEmail();
        } else if (name.equalsIgnoreCase("sms")) {
            sendSMS();
        } else {
            System.out.println("Invalid notification type");
        }
    }


    public void sendEmail () {
        for (Customer customer : customerList) {
            System.out.println("Sending email to: " + customer.getEmail());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

    public void sendSMS () {
                for (Customer customer : customerList) {
                    System.out.println("sending SMS to: " + customer.getPhoneNumber());

                }
    }



}
