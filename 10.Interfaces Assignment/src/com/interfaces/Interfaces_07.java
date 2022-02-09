/**
 * 07. Create an interface and inherit it from the other interface.
 */
package com.interfaces;

interface Jala_7 {
    void methodOne();
}

//inherited interface
interface Jala_07 extends Jala_7 {
    void methodTwo();
}

class Interfaces_07 implements Jala_07 {
    @Override
    public void methodOne() {
        System.out.println("This is first method");
    }

    @Override
    public void methodTwo() {
        System.out.println("This is second method");
    }

    public static void main(String[] args) {
        Interfaces_07 if7 = new Interfaces_07();
        //Calling the methods implemented
        if7.methodOne();
        if7.methodTwo();
    }
}
