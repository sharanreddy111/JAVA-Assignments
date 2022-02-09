/**
 * 3. Create a class with PROTECTED fields and methods. Access these fields and methods
 * from any other class in the same package.
 */
package com.accessmodifiers;

public class AccessModifiers_03 {
    //Protected field
    protected String name;

    //Protected method
    protected void protectedMethod() {
        System.out.println("This is a " + name);
    }
}

//Accessing protected fields and methods from other class in the same package
class protectedClass_03 {
    public static void main(String[] args) {

        AccessModifiers_03 pc = new AccessModifiers_03();
        pc.name = "Protected Method";
        pc.protectedMethod();
    }
}
