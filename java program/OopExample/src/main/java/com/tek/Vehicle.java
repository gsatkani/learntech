package com.tek;

public class Vehicle {

   protected String brandName;
   protected double price;
   protected String color;


    public Vehicle() {

    }

    public Vehicle(String brandName, double price, String color) {
        this.brandName = brandName;
        this.price = price;
        this.color = color;
    }

// getter and setter

    public void displayVehicle(){
        System.out.println(brandName +"--" +price + "--"+color);
    }


}
