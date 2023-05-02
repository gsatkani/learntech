package com.gsat;

public class Student {
    String id;
    String name;
    //Static . class variable
    static String college="ABC eng College";
    //static /class methods
    static String getCollegeName(){
        //System.out.println(id); only static variable
        return college;
    }
    static {
        System.out.println("Allows only static variable / class is loaded into memory");
    }
    public Student(){
        System.out.println("Student Constructor");
    }
    public static void main(String[] args) {
        Student s1=new Student();
        s1.id="101";
        s1.name="Kartick";
        //Static methods/variables can be accessed without creating an object
        //classname.variable classname.method
        System.out.println(Student.college);
        System.out.println(Student.getCollegeName());
    }

}
