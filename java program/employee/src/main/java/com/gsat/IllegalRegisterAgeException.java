package com.gsat;

//Step 1 : class extends Execption Class
public class IllegalRegisterAgeException extends Exception {

    //Step2 : parameteried constructor
    public IllegalRegisterAgeException(String msg){
        super(msg); // Super method will call parent/super class constructor

    }
}
