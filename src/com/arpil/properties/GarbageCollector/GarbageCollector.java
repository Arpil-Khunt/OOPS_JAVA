package com.arpil.properties.GarbageCollector;

public class GarbageCollector {
    GarbageCollector(){
        System.out.println("Object is created");
    }
    @Override
    protected void finalize(){
        System.out.println("Objct is destroyed");
    }
}

 class Main{
    public static void main(String args[]){

        //without forcing garbage collector object is destoyed
//        for(int i = 0 ; i < 1000000 ; i++){
//            GarbageCollector obj = new GarbageCollector();
//        }
        //there are three-way to unreference the object
        GarbageCollector obj1 = new GarbageCollector();
        obj1 = null; // 1.referencing null value

        GarbageCollector obj2 = new GarbageCollector();
        GarbageCollector obj3 = new GarbageCollector();
        obj3 = obj2;  // 2. by referencing another object

         new GarbageCollector(); //3. using anonymous object

        //force to invoked garbage collector
        System.gc();

    }
 }
