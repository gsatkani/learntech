package com.poly;

public class PolyMain {
    public static void main(String[] args){
           Addition x=new Addition();
        System.out.println(x.add(10,10));
        System.out.println(x.add(10,0,30));
        System.out.println(x.add(12.10,22));
        System.out.println(x.add(34,67.8));

        // Method Overriding
        Laptop laptop=new Laptop();
        System.out.println(laptop.gaming());

        Dell del=new Dell();
        System.out.println(del.gaming());

        //Dell dell=(Dell) new Laptop();
        // Dynamic Dispatch method
        Laptop lap=new Dell();
        System.out.println(lap.gaming());

    }
}
