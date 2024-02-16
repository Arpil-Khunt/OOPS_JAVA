package com.arpil.properties.abstractDemo;

public abstract  class Parent {

    int age;
    static void hello(){
        System.out.println("hey!");
    }
    //you can create normal method also here, but don't create normal method it's not look good
    void normal(){
        System.out.println("how are you ?");
    }
    abstract void career();
    abstract  void partner();
}
