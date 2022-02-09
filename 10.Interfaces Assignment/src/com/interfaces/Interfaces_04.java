/**
 * 04.Create two interfaces with one method each. Implement these two interfaces in one
 * class.
 */
package com.interfaces;

//interface 1
interface Jala_4 {
    void methodOne();
}

//interface 2
interface Jala_04 {
    void methodTwo();
}

//Implemented these two interfaces in one class
public class Interfaces_04 implements Jala_4, Jala_04 {

    @Override
    public void methodOne() {
        System.out.println("This is Method one");
    }

    @Override
    public void methodTwo() {
        System.out.println("This is Method two");
    }

    //main method
    public static void main(String[] args) {
        Interfaces_04 if4 = new Interfaces_04();
        //Calling the methods implemented
        if4.methodOne();
        if4.methodTwo();
    }
}
