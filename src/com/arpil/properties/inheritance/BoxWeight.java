package com.arpil.properties.inheritance;

public class BoxWeight extends Box {
   double weight;

   //static method cannot be overrided
   static void greeting(){
       System.out.println("I am in BoxWeight class. greeting!!");
   }
    @Override
   void hello(){
       System.out.println("hey! BoxWeight");
   }
   BoxWeight(){
       super();
       this.weight = -1;
   }

    public BoxWeight(double l, double w, double h, double weight) {
        super(l, w, h);// what is this? It's nothing but it's call parents class constructor
        this.weight = weight;

    }

    public BoxWeight(double side , double weight){
       super(side);
       this.weight = weight;
    }
}
