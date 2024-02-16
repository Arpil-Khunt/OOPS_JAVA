package com.arpil.properties.interfaces.extendDemo;

public class Main implements B {
    @Override
    public void fun() {

    }



    public static void main(String[] args) {
        Main obj = new Main();
        //In interface method only can access using Interface name
        A.greeting();
    }

}
