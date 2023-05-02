package com.gsat;

public class ExceptionExample {
    public static void main(String[] args) {

        int a=10,b=0;
        try{
            int result=a/b;
            System.out.println(result);
        }
        catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
        }

        try{
            String str=null;
            System.out.println(str.toUpperCase());
        }catch(NullPointerException ex){
            System.out.println(ex);
        }

        try{
            String str="123a";
            Integer aa=Integer.parseInt(str);
            System.out.println(aa);
        }catch(NumberFormatException ex){
            System.out.println(ex);
        }


        catch(Exception ex){
            System.out.println(ex);
            System.out.println(ex.getClass());
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("Execute always");
        }

        System.out.println("Hello World");

    }
}
