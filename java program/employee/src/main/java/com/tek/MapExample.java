package com.tek;

import jdk.nashorn.internal.runtime.PropertyHashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        // Map - >  store Key-Value pair
        HashMap<Integer,String> studentMap=new HashMap<Integer, String>();
        studentMap.put(101,"Sathish");
        studentMap.put(102,"Teja");
        studentMap.put(103,"Madhu");
        studentMap.put(104,null);
        studentMap.put(null,null);
        studentMap.put(104,"Siva"); // No Duplicate Key / one null key allowed

        System.out.println(studentMap); // prints in any order

        Collection<String> values = studentMap.values();
        System.out.println(values);
        Set<Integer> keys = studentMap.keySet();
        System.out.println(keys);
        System.out.println(studentMap.containsValue("Siva"));
        System.out.println(studentMap.containsKey(103));
        // Map.Entry A map entry (key-value pair).
        Set<Map.Entry<Integer, String>> entries = studentMap.entrySet();
        for( Map.Entry<Integer,String> map :entries){
            //System.out.println(map.getKey() +"---" +map.getValue());
            if( map.getKey()!=null && map.getKey()%2==0 ){
                System.out.println(map.getValue());
            }
        }
        System.out.println(studentMap.get(101));
  // print student name whose roll number is even

    }

}
