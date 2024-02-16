package com.arpil.properties.access;

public class Main {

   static int a ;
   //first execute
    static {
        a = 10;
    }
    //third execute
    public static void main(String args[]){
        A obj = new A(10,"arpil");

        //need to do few thing
        //1. access the data member
        //2.modify the data member

       // System.out.println( obj.getter());
        System.out.println(a);
    }

    //second execute
    static{
        System.out.println("I am in second static block");
    }
}
