package com.gsat;
// public abstract
public class Outer {
    int x=100;
    // Inner class
    private class Inner {
        int y=200;

    }
    static class StaticInner{
        int z=100;
    }

    public static void main(String[] args) {
        Outer outer=new Outer();
        System.out.println(outer.x);

        Outer.Inner inner= outer.new Inner();
        System.out.println(inner.y);

        Outer.StaticInner staticInner=new Outer.StaticInner();
        System.out.println(staticInner.z);





    }

}
