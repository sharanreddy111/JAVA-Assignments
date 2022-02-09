package com.exceptions;

import java.lang.reflect.Method;

class E_14 {
    public void addition(int a, int b) {
        int c;
        c = a + b;
        System.out.println(c);
    }
}

public class Exceptions_14 {
    public static void main(String[] args) {

        try {
            Class c = Class.forName("com.exceptions.E_14");
            //There is no subtraction() method in class Exceptions_14
            Method m = c.getDeclaredMethod("subtraction", int.class, int.class);
        }
        //Throws NoSuchMethodException
        catch (NoSuchMethodException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

