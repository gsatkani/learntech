package com.tek;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {

        //The root interface in the collection hierarchy.
        // A collection represents a group of objects, known as its elements.
        // Some collections allow duplicate elements and others do not. Some are ordered and others unordered.

        // int ->  Wrapper class Integer
        List<Integer> list=new ArrayList<Integer>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        //list.add("6767"); // Generics 1. Type Safety 2.CompileTime checking 3.No typeCastig
        list.add(100); // duplicate allowed
        //list.add(null); // null values allowed
        System.out.println(list);
        int sum=0;
        // sum of elements
        for (int i = 0; i < list.size(); i++) {
            sum=sum + list.get(i);
        }

       for( Integer x: list){
           sum=sum+x;
       }

       list.add(2,1000);
        System.out.println(list);
        boolean status=list.contains(400);
        if(status){
            System.out.println("element is found");
        }
        else{
            System.out.println("element is not found");
        }
        int removedValue=list.remove(1);
        System.out.println("Removed Value " + removedValue);
        System.out.println(list);

        int indexOf1000=list.indexOf(1000);
        System.out.println("Index of 1000 " + indexOf1000);

        List<Integer> subList=list.subList(0,4);
        System.out.println(subList);
        System.out.println(list.set(1,2000));
        System.out.println(list);


         Iterator<Integer> integerIterator =list.iterator();  // fail fast / fail safe
        while(integerIterator.hasNext()) {
           int x= integerIterator.next();
            System.out.println(x);
            if(x==100){
                integerIterator.remove();
            }
            System.out.println("Check 100 removed");
            System.out.println(list);

        }


        // Difference between Array / ArrayList
        int[] marks=new int[10]; //  fixed size 10*4=40bytes
        // store 5 values 20 bytes wasted

    }
}
