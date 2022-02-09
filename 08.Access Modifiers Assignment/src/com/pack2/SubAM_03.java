/**
 * 3. Also, Access the PROTECTED fields and methods from child class located
 * in a different package
 * <p>
 * - Access the PROTECTED fields and methods from any class in different package
 */
package com.pack2;

//importing different package
import com.accessmodifiers.AccessModifiers_03;

//Accessing the PROTECTED fields and methods from child class
public class SubAM_03 extends AccessModifiers_03 {
    public static void main(String[] args) {

        //Creating object of SubAM_03
        SubAM_03 sub = new SubAM_03();
        sub.name = "Protected Method in SubClass";
        //Calling Method
        sub.protectedMethod();
    }
}
/*
NOTE :
- protected member can be access within the package and outside the package but within the child classes
 */
