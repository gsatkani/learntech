package com.abs;

public class CalcMain extends Calculator{


    public int add(int x, int y) {
        return x+y;
    }

    public static void main(String[] args) {
        // cannot create an object for abstract class
        // Calculator cal=new Calculator();
        CalcMain calcMain=new CalcMain();
        calcMain.x=100;
        calcMain.y=200;
        int add= calcMain.add(calcMain.x,calcMain.y);
        System.out.println(add);
        System.out.println("-----------");
        int sum=calcMain.display();
        System.out.println(sum);
    }
}
