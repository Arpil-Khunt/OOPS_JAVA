package com.arpil.properties.access;

public class ObjectDemo {

    int num ;
    float gpa ;
    public ObjectDemo(int num , float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {

    }

    public static void main(String args[]){
        ObjectDemo obj1 = new ObjectDemo(5,79.8f);
        ObjectDemo obj2 = new ObjectDemo(12,78.5f);

        if(obj1==obj2){
            System.out.println("obj1 is less than obj2");
        }
        else{
            System.out.println("not equal");
        }
    }
}
