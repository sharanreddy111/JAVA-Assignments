/**
 * 5. Programs on Logical AND,OR operator and Logical NOT
 */
package com.operators;

public class Operators_05 {
    public static void main(String[] args) {
        int a = 15;
        int b = 10;
        int c = 5;
        // Logical AND
        System.out.println(a > b && a > c); // true  && true  = true
        System.out.println(a < b && a < c); // false && false = false
        System.out.println(a > b && a < c); // true  && false = false

        //Logical OR
        System.out.println(a > b || a > c); // true  || true  = true
        System.out.println(a < b || a < c); // false || false = false
        System.out.println(a < b || a > c); // false || true  = true

        //Logical NOT
        System.out.println(!(a > b));      // NOT true = false
        System.out.println(!(a < b));      // NOT false = true
    }
}
