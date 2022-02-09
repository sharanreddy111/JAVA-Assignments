/**
 * 08. Create a PUBLIC interface with fields and methods, fields should have values assigned.
 * Implement this interface to some class and print the values of the interface fields and
 * call the interface methods
 */
package com.interfaces;

//public interface with fields and methods
public interface Interfaces_08 {
    //all the fields are public, static and final by default
    int num = 111; //values assigned

    public void myMethod();
}

//Implemented interface to a class
class Jala_08 implements Interfaces_08 {
    @Override
    public void myMethod() {
        System.out.println("This is a method");
    }

    //main method
    public static void main(String[] args) {
        Jala_08 j = new Jala_08();
        //printing the values of the interface fields
        System.out.println(num);
        //calling the interface methods
        j.myMethod();
    }
}
