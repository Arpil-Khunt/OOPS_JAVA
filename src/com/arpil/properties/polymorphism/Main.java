package com.arpil.properties.polymorphism;

public class Main {

    public static void main(String args[]){
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Shapes tiangle = new Triangle();

         tiangle.area();
        shape.area();
    }
}
