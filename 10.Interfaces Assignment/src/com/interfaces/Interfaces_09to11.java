/**
 * 09. Create a PRIVATE or PROTECTED interface and print the values as above scenario
 * 10. Create an interface with private, public and protected fields
 * 11.  Create an interface with static final variable
 */
package com.interfaces;

interface Jala_09 {

    public int num1 = 11;
    static final int num2 = 22;
    final int num3 = 33;
    // private int num4 = 44;  - error
    // protected int num5 = 55; - error
}

class Interfaces_09to11 implements Jala_09 {

    public static void main(String[] args) {
        Interfaces_09to11 if9 = new Interfaces_09to11();
        System.out.println(if9.num1 + " " + if9.num2);
    }
/* NOTE :
1. Interface in Java is similar to class but, it contains only abstract methods and
   fields which are final and static.

2. If the members of the interface are private you cannot provide implementation to
   the methods or, cannot access the fields of it in the implementing class.

3. The protected members can be accessed in the same class or,the class inheriting it.
   But, we do not inherit an interface we will implement it.

 */
}

