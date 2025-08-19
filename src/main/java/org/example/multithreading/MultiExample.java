package org.example.multithreading;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MultiExample {
    public static void main(String[] args){
        List<Customer> customers = new ArrayList<>();

        // generate 100 records
        for (int i=0; i<100; i++){
            customers.add(new Customer("Customer"+i, "customer" + i + "@example.com", "1234567" + i  ));
        }
        //add to file
        String fileName = "customers.txt";
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))){
            for(Customer c : customers){
                writer.write(c.getName() + " , " + c.getEmail() + " , " + c.getPhoneNumber() );
                writer.newLine();
            }
            System.out.println("All customers appended to customers file successfully");

        }catch (IOException e){
            e.printStackTrace();
        }

//        // Step 2: Batch size and thread list
//        int batchSize = 20;
//        List<Thread> threads = new ArrayList<>();
//
//        // step ;3 creaate runnable for each batch
//        for(int i=0; i< customers.size(); i += batchSize){
//            int start = i;
//            int end = Math.min(i + batchSize, customers.size());
//            List<Integer> batch = customers.subList(start, end);
//            Runnable task = new customers ("")
//        }




        SendGreetings emailThread = new SendGreetings("email", customers);

        SendGreetings smsThread = new SendGreetings("sms", customers);

        emailThread.start();
        smsThread.start();



    }
}
