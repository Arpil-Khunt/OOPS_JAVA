package com.arpil.properties.access;

public class A {

   protected int num;
    String name;
    int arr[];

    int getter(){
        return num;
    }


    A(int num , String name){
        this.num = num ;
        this.name = name;
        this.arr = new int[num];
    }

}
