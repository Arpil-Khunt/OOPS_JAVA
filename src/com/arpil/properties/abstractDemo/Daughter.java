package com.arpil.properties.abstractDemo;

public  class Daughter extends Parent {

    Daughter(int age){
        this.age = age;
    }
          @Override
          void career(){
              System.out.println("I want to become a Coder");
          }
          void partner(){
              System.out.println("I love Iron man");
          }
}
