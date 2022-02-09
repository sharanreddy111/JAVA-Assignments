/**
 * 8. Write a program to find Armstrong number or not.
 */
package com.loops;

import java.util.Scanner;

public class Loops_08 {

    static boolean isArmstrong(int n) {
        int r, result = 0;
        int orig = n;
        while (n != 0) {
            r = n % 10;
            //power of r for each individual and add those numbers
            //eg: 153 = 1^3 + 5^3 + 3^3 ==> 1 + 125 + 27 ==> 153
            result += (r * r * r);
            n = n / 10;
        }
        return orig == result;
    }

    public static void main(String[] args) {

        System.out.print("Enter a number : ");
        int num = new Scanner(System.in).nextInt(); //Input stored in num

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }
}
