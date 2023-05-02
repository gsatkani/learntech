package com.abs;
public class MathMain implements MathOperation{
    public int add(int x, int y) {
        return x+y;
    }
    public double sub(double x, double y) {
        return x-y;
    }
   public double mul(double x, double y) {
        return x*y;
    }
    public double div(int x, int y) {
        if(y!=0){
            return x/y;
        }
        else{
            System.out.println("Divide By Zero");
        }
        return 0;
    }

    public static void main(String[] args) {
        //Cannot create an object for interfrace
        //MathOperation mathOperation=new MathOperation();

        MathMain mathMain=new MathMain();
        int a=MathOperation.x;
        int b=MathOperation.y;
        // Cannot assign a value to final variable 'x'
        //MathOperation.x=200;
        System.out.println(mathMain.add(a,b));
    }

}
