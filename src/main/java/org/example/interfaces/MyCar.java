package org.example.interfaces;

public class MyCar extends Customisation implements BasicFeatures{
    @Override
    public String make() {
        return "toyota";
    }

    @Override
    public int year() {
        return 0;
    }

    @Override
    public String model() {
        return "LE";
    }

    @Override
    public String carColor() {
        return "Red";
    }

    @Override
    public String interiorDesign() {
        return "Basic";

    }
    @Override
    public int price(){
        return 9000;
    }
}
