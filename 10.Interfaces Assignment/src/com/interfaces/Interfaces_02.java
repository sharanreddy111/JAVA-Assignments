/**
 * 02. Create an interface with two methods, but implement only one in a class. Call the
 * method implemented.
 */
package com.interfaces;

interface Jala_02 {
    void methodOne();

    void methodTwo();
}

public class Interfaces_02 implements Jala_02 {
    //cannot implement only one method in a class
    @Override
    public void methodOne() {
        System.out.println("First Method");
    }

    @Override
    public void methodTwo() {
        System.out.println("Second Method");
    }

    //main method
    public static void main(String[] args) {
        Interfaces_02 if2 = new Interfaces_02();
        //Calling the methods implemented
        if2.methodOne();
        if2.methodTwo();
    }
}
/*
   NOTE :
   - A class that implements an interface must implement all the methods declared in the interface.
 */
