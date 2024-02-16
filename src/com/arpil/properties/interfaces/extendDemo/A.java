package com.arpil.properties.interfaces.extendDemo;

public interface A {
    void fun();
    //static method inside the interface should always have a body because it's can not be overridden
    static void greeting(){
        System.out.println("Hey I am in static method");
    }
}
