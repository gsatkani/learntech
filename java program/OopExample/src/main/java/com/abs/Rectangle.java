package com.abs;

public class Rectangle  implements Shape{

    double length;
    double  bredth;
    public double calculateArea() {
        return length*bredth;
    }

    public Rectangle() {
    }

    public Rectangle(double length, double bredth) {
        this.length = length;
        this.bredth = bredth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBredth() {
        return bredth;
    }

    public void setBredth(double bredth) {
        this.bredth = bredth;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", bredth=" + bredth +
                '}';
    }
}
