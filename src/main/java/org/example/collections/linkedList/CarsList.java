package org.example.collections.linkedList;

import org.example.collections.arraylist.Car;

import java.util.LinkedList;

public class CarsList {
    public static void main(String[] args){
        // create linked list of car object
        LinkedList<Car> carsList = new LinkedList<>();

        // adding the cars
        carsList.add(new Car("Toyota", "Camry", 2020));
        carsList.add(new Car("Honda", " Civic", 2019));
        carsList.add(new Car( "Ford", "Mustang", 2021));

        //print all cars
        System.out.println("All cars: ");
        for (Car car : carsList){
            System.out.println(car);
        }

        //Access a car by index
        System.out.println("\nCar at index 1: " + carsList.get(1));

        //modify a car
        carsList.set(0, new Car("Tesla", "Model S", 2019));
        System.out.println("\nAfter modifying the first Car: " );
        System.out.println(carsList.get(0));

        //remove a car
        carsList.remove(2);
        System.out.println("\nAfter removing the car");
        for( Car car : carsList){
            System.out.println(car);
        }

        // check if a car is in the list
        Car checkCar = new Car("Honda", "Civic", 2019);
        boolean contains = carsList.contains(checkCar);
        System.out.println("\n contains Honda civic 2019? "+ contains);
        //add first
        carsList.addFirst(new Car("Tesla", "Cyber Truck", 2024));
        for( Car car : carsList) {
            System.out.println(car);
        }



    }
}
