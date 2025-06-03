package org.test;

public class Main {

    public static void main(String[] args) {
        Bike a=new Bike();
        Spendor b= new Spendor();
        a.run();
        b.run();
        Bike c =new Spendor();
        c.run();
    }

}
