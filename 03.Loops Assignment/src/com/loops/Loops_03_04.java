/**
 * 3. Program to equal operator and not equal operators.
 * 4. Write a program to print the odd and even numbers.
 */
package com.loops;

import java.util.Scanner;

public class Loops_03_04 {

    static void evenNumbers(int n) {
        System.out.println("These are Even Numbers from 0 to " + n);
        // If the remainder is zero then given number is even number
        for (int i = 1; i <= n; i++) {
            //using equal operator ( == )
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
    }

    static void oddNumbers(int n) {
        // If the remainder is one then given number is odd number
        System.out.println("\nThese are Odd Numbers from 1 to " + n);
        for (int i = 1; i <= n; i++) {
            // using not equal operator( != )
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        num = sc.nextInt(); //input stored in num
        evenNumbers(num);
        oddNumbers(num);
    }
}


