package com.arpil.properties.interfaces;

public class Main {
    public static void main(String args[]){

    NiceCar car = new NiceCar();
       // car.start();
        Engine eg = new ElectricEngine();
        car.upgradeEngine(eg);
        car.start();
//        car.acc();
//        car.stop();
//        car.brake();
    }
}
