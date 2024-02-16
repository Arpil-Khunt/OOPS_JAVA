package com.arpil.properties.polymorphism;

public class Circle extends Shapes {

       //this will run when the object of circle is created
     // hence, it's overriding the parent method
    @Override  //this is called annotation
    void area() {
        System.out.println("area of circle is pi*r*r");
    }
}
