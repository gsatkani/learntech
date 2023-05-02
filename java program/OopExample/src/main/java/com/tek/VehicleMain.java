package com.tek;

public class VehicleMain {

    public static void main(String[] args) {
        //Create object for Super Class
        Vehicle vehicle=new Vehicle("Maruti",670000,"Red");
        vehicle.displayVehicle();

        MarutiCar baleno=new MarutiCar("Maruti",54545454,"Grey","Baleno");
        baleno.displayMarutiCar();


    }
}
