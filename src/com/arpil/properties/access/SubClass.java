package com.arpil.properties.access;

public class SubClass extends A{
    SubClass(int num , String name){
        super(num,name);
    }

    public static void main(String args[]){
        SubClass obj = new SubClass(5,"Arpil");
        int n = obj.num;
    }
}
