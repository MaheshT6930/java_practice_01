package org.example.collections.arraylist;
//ArrayList with car object


import java.util.ArrayList;
import java.util.Comparator;

public class CarList {
    public static void main(String[] args){
        // creating arraylist of car object
        ArrayList<Car> carList = new ArrayList<>();

        //Add car objects
        carList.add(new Car("Toyota", "Camry", 2020));
        carList.add(new Car("Honda", "Civic", 2019));
        carList.add(new Car("Ford", "Mustang", 2021));

        // print all cars
        System.out.println("All cars:" );
        for (Car car: carList){
            System.out.println(car);
        }

        //Access a car by index
        System.out.println("\nCar at index 1: " + carList.get(1));

        // modify a car at index
        carList.set(0, new Car("Tesla", "model Y", 2024));
        System.out.println("\nAfter mkdifying the first car: ");
        System.out.println(carList.get(0));

        //remove a car
        carList.remove(2);
        System.out.println("\nAfter removing the thirxd car:");
        for(Car car : carList ){
            System.out.println(car);
        }

        //Check if car is in the list
        Car checkCar = new Car("Honda", "Civic", 2019);
        boolean contains = carList.contains(checkCar);
        System.out.println("\nContains honda civic 2019: " + contains);

        // get size of the list
        System.out.println("\nTotal cars: " + carList.size());

        //Sort the list by year using comparator
        carList.sort(Comparator.comparingInt(car-> car.year));
        System.out.println("\nCars sorted by year: ");
        for (Car car : carList){
            System.out.println(car);
        }

        //clear the list
        carList.clear();
        System.out.println("\nAfter  clearing list, is empty? " + carList.isEmpty());
    }

}
