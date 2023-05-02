package com.tek;

import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList=new LinkedList<Integer>();
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);
        linkedList.add(400);
        linkedList.add(500);

        linkedList.addFirst(99);
        linkedList.addLast(503);

        int firstEleR=linkedList.removeFirst();
        int lastEleR=linkedList.removeLast();
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.get(3));

        boolean addLast=linkedList.offer(1000);//Adds the specified element as the tail (last element) of this list.
        linkedList.push(2000); // inserts the element at the front of this list.
        int rmFirst=linkedList.pop(); //removes and returns the first element of this list.
        linkedList.peek(); // Retrieves, but does not remove, the head (first element) of this list.
        linkedList.poll(); // Retrieves and removes the head (first element) of this list.

        System.out.println("Set Interface");
        Set<String> city=new TreeSet<String>(); // Hash function
        city.add("Delhi");
        city.add("Chennai");
        city.add("Hyderabad");
        city.add("Kochi");
        city.add("Pune");
        city.add("Delhi"); // no duplicates
        city.add(null);

        System.out.println(city); // Unordered collection






    }



}
