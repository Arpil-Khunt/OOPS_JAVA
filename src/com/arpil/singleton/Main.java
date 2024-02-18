package com.arpil.singleton;

public class Main {
    public static void main(String args[]){

        //all three reference variable are pointing to same object in the heap
        Singleton obj = Singleton.getInstance();
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
    }
}
