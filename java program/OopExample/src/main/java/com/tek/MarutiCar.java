package com.tek;

public class MarutiCar extends Vehicle {

    String model;

    public MarutiCar(String brandName, double price, String color, String model) {
        super(brandName, price, color);
        this.model = model;
    }

    public void displayMarutiCar(){
        displayVehicle();
        System.out.println("Model " + model);
    }

}
