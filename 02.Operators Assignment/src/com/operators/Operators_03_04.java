/**
 * 3. Program to equal operator and not equal operators
 * 4. Write a program to find the two numbers equal or not.
 */
package com.operators;

import java.util.Scanner;

public class Operators_03_04 {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter first number : "); //
        int a = num.nextInt();
        System.out.print("Enter second number : "); //
        int b = num.nextInt();
        //not equal operator
        if (a == b) {
            System.out.println("Both are numbers equal");
        }
        //not equal operator
        else if (a != b) {
            System.out.println("Both are numbers different");
        }
    }
}
