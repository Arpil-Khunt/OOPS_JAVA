package com.arpil.properties.inheritance;

public class Main {
    public static void main(String args[]){
//        Box a = new Box();
//        System.out.println(a.l+" "+a.h+" "+a.w);
//       BoxWeight box1 = new BoxWeight();
//        System.out.println(box1.weight);
//        BoxPrice box5 = new BoxPrice(6,5,10);
//        System.out.println(box5.l+" "+box5.cost+" "+box5.weight);

        Box box = new BoxWeight();
        box.hello();
    }
}
