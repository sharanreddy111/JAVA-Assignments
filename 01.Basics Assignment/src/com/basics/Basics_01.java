/**
 * 1. How to create a class, object, method and its signature.
 */
package com.basics; // This is a package

// created a class using "class" keyword
public class Basics_01 {
    //created a method using methodName()
    void isMethod() {
        //fields are used to store data
        String a = "This is a Method";
        System.out.println(a);
    }

    public static void main(String[] args) {
        // Created an object of Basics_01
        Basics_01 obj = new Basics_01();
        // Calling the method
        obj.isMethod();
    }
}
