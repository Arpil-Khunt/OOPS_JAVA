package com.arpil.properties.abstractDemo;

public  class Son extends Parent{

    Son(int age){
        this.age = age;
    }


    static void hello(){
        System.out.println("I am in son class static");
    }
//    @Override
//    void normal(){
//        System.out.println("I am fine. what about you ?");
//    }

    @Override
    void career(){
        System.out.println("I want to become a Doctor ");
    }
    void partner(){
        System.out.println("I love Shushantsinh Rajput");
    }
}
