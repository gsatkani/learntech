package com.poly;

public class Addition {
    // same method name -  different actions
    // method overloading
    // Rule for 1.Same method name 2.different number of parameter 3. different datatype
    // check during compile time
    public int add(int x ,int y){
        return  x+y;
    }
   public int add(int x,int y,int z){
        return x+y+z;
    }
    public double add(double x,double y){
        return x+y;
    }
    public double add(int x,double y){
        return x+y;
    }

}
