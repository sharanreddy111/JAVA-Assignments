/**
 * 06. Create an interface with a default method and implement it in a class. Do not provide
 * implementation to the default method and call the method.
 */
package com.interfaces;

interface Jala_06 {
    //default method
    default void defaultMethod() {
        System.out.println("This is a default method");
    }
}

class Interfaces_06 implements Jala_06 {
    public static void main(String[] args) {
        //Didn't provide implementation to the default method
        Interfaces_06 if6 = new Interfaces_06();
        //Calling the method
        if6.defaultMethod();
    }
}
