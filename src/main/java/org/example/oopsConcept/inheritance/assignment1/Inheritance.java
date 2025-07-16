package org.example.oopsConcept.inheritance.assignment1;

public class Inheritance {
    public static void main(String[] args){
        Hilton super_Hilton = new Hilton();
        System.out.println("hotel Hiltion info");
        super_Hilton.roomServiceingHours();
        super_Hilton.poolTimings();


        Mariot farmerMariot = new Mariot();
        System.out.println("Hotel Mariot info ");
        farmerMariot.banquetHall();
        farmerMariot.hotelManger();
        farmerMariot.roomServiceingHours();
        farmerMariot.brunchTiming();
    }

}
