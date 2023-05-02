package com.poly;

public class Dell extends Laptop {

    String model;
    String Processor;
    @Override
    public String gaming(){
        return "High End Graphic Processor";
    }

    //Rule for method Overiding
    // Same method name
    // Number of parameters should be same
    // same retrun type
    // method signature should be same
    // checked during run time
}
