package com.gsat;

public class UserDefinedException {

    public static void main(String[] args) {
        String accountNumber="10101010110"; // length 10 only didgits
        int age=17;
        try{
            if(age<18){
                IllegalRegisterAgeException abc= new IllegalRegisterAgeException("Invalid Age to register");
                throw abc;
            }
            System.out.println("Registered Sucessfully");
        }catch(IllegalRegisterAgeException ex){
            System.out.println(ex.getMessage());
        }
        finally{
            System.out.println("Execute always");
        }


    }
}
