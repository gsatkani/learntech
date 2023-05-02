package com.abs;

public interface MathOperation {

    static final int x=100,y=5; // static final varaible

    // only abstract method
    abstract int add(int x,int y);
    double sub(double x,double y);
    double mul(double x,double y);
    double div(int x,int y);
}
