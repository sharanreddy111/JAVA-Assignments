/**
 * 11. Program to check whether a number is EVEN or ODD using switch
 */
package com.loops;

import java.util.Scanner;

public class Loops_11 {

    public static void main(String[] args) {
        int n;
        System.out.print("Enter a number : ");
        n = new Scanner(System.in).nextInt();

        switch (n % 2) {
            //Even number has a remainder of 0 if divided by 2
            case 0:
                System.out.println(n + " is an Even Number");
                break;
            //Odd number has a remainder of 1 if divided by 2
            case 1:
                System.out.println(n + " is an Odd Number");
                break;
        }
    }
}

