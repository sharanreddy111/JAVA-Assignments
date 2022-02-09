/**
 * 8. Write a program to generate Arithmetic Exception
 */
package com.exceptions;

public class Exceptions_08 {

    public static void main(String[] args) {
        int a = 10, b = 0, c;
        try {
            //below code throws divide by zero exception
            c = a / b;

            //handles the Arithmetic Exception / Divide by zero exception
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException caught!");
            e.printStackTrace();
        }
    }
}
