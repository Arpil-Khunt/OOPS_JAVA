package com.arpil.properties.inheritance;

 class Box {
    double l ;
     double w ;
     double h;
     static void greeting(){
         System.out.println("I am in Box class. greeting!!");
     }

     void hello(){
         System.out.println("hello! Box");
     }
     Box(){
         this.l = -1;
         this.h = -1;
         this.w = -1;
     }
     //cube
     Box(double side){
         this.l = side;
         this.w = side;
         this.h = side;
     }

     Box(double l , double w , double h){
         this.l = l ;
         this.w = w;
         this.h = h;
     }

     void information(){
         System.out.println("Running the boxes");
     }
}


