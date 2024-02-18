package com.arpil.singleton;

public class Singleton {
    //it's a class which you can create only one instance of that class

   private Singleton(){

    }
    static Singleton  instance;
   public static Singleton getInstance(){
       if(instance == null){
           instance = new Singleton();
       }
       return instance;
   }
}
