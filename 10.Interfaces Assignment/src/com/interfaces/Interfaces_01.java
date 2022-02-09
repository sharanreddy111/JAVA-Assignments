/**
 * 01. Create an interface with only one method and implement it in a class. Call the method
 * implemented.
 */
package com.interfaces;

//An interface is declared by using the interface keyword.
interface Jala_01 {
    //An abstract method doesn't have its body, and they are public and abstract
    void oneMethod();
}

public class Interfaces_01 implements Jala_01 {
    @Override
    public void oneMethod() {
        System.out.println("This is a method");
    }

    public static void main(String[] args) {
        Interfaces_01 if1 = new Interfaces_01();
        //Calling the method implemented
        if1.oneMethod();
    }
}
