/**
 * 1. Create a class with PRIVATE fields, private method and a main method. Print the fields
 * in main method. Call the private method in main method.
 * <p>
 * Create a subclass and try to access the private fields and methods from subclass
 */
package com.accessmodifiers;

public class AccessModifiers_01 {
    //private fields
    private String name = "Sharan";
    private int age = 21;

    //private method
    private void pvtMethod() {
        System.out.println("My Name is " + name + " and my age is " + age);
    }

    //main method
    public static void main(String[] args) {

        AccessModifiers_01 obj = new AccessModifiers_01();
        //Printing the fields in main method
        System.out.println(obj.age);
        System.out.println(obj.name);
        //Calling the private method in main method
        obj.pvtMethod();
    }
    // NOTE : A subclass does not inherit the private members of its parent class
}





