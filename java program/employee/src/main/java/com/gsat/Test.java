package com.gsat;

import java.util.regex.Pattern;

//Object class - root class for entire Java
class A {
    int a=100;
    public A(){
        super();
        System.out.println("A");
        System.out.println(a);
    }
}

class B extends A{
    int a=200;
    public B(){
        super();
        System.out.println("B");
        System.out.println(a);
        System.out.println(super.a);
    }
}
public class Test extends B {
    int a=300;
    String city="Chennai";
    public Test(){
        super();
        String city="Pune";
        System.out.println(city); // local
        System.out.println(this.city); // refer current class instance variable
    }

    public static void main(String[] args) {
        String mobile="123456789";

        // {9,8,7}

        boolean status =mobile.matches("[0-9]{5,10}");
        if(status){
            System.out.println("Contains Only digits");
        }
        else{
            System.out.println("Invalid");
        }

        mobile.matches("[987]{1}[0-9]{9}");

        // password validation
        // password length 8-20 charcters
        // atleast One Upper
        // atleast One Lower
        // atleast one digit
        //  atleast one Special charcter (@#$)

        //upper case
        //lowercase
        // upper lower digits
        // upper lower digits [length 10]




    }
}
