package org.example.collections.arraylist;
//car class
public class Car {
    String brand;
    String model;
    int year;

    public Car (String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;

    }

    public String toString(){
        return brand + " " + model + " ( " + year +" ) ";

    }
}
