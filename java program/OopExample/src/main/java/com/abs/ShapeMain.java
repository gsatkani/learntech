package com.abs;

import java.util.Scanner;

public class ShapeMain {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        do{
            System.out.println("Press 1.Rectangle 2.Circle");
            switch (scan.nextInt()){
                case 1:
                    Rectangle rectangle=new Rectangle();
                    System.out.println("Enter Length");
                    rectangle.setLength(scan.nextDouble());
                    System.out.println("Enter Bredth");
                    rectangle.setBredth(scan.nextDouble());

                    double rectArea=rectangle.calculateArea();
                    System.out.println("Area of Rectangle " + rectArea);
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Thank you");
                    System.exit(0);
            }
        }while(true);
    }

}
