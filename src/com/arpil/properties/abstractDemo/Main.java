package com.arpil.properties.abstractDemo;

public class Main {
    static int a ;
    public static void main(String args[]){

        a += 1;
        System.out.println(a);


        Son son = new Son(30);
//        son.career();
//         son.normal();
        Daughter daughter = new Daughter(28);
        Parent daughter1 = new Daughter(28);
        daughter1.career();
    }
}
