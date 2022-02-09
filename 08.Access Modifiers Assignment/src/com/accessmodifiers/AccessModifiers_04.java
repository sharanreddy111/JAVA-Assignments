/**
 * 4. Create a class with PUBLIC fields and methods.
 * Access the public methods and fields from any class in the same package or different
 * package
 */
package com.accessmodifiers;

class PublicClass_04 {
    //public fields
    public String pName = "Public";

    //public method
    public void publicMethod() {
        System.out.println("This is " + pName);
    }
}

//Accessing the public methods and fields from other class in the same package
public class AccessModifiers_04 {
    public static void main(String[] args) {
        //Creating object of PublicClass_04.
        PublicClass_04 pub = new PublicClass_04();
        pub.pName = "Public Method";
        //Calling method
        pub.publicMethod();
    }
}
