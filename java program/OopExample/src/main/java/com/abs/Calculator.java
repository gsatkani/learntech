package com.abs;

public abstract class Calculator {

    // Contains 1.abstract methods 1.non-abstract methods
    int x,y;

    public abstract int add(int x,int y);  // no body

    public int display(){
        return x+y;

    }
}
