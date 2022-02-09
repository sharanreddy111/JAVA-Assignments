/**
 * 9. Write a program to find the prime or not.
 */
package com.loops;

import java.util.Scanner;

public class Loops_09 {

    static void primeNumber(int n) {
        //Prime numbers are only divisible by 1 and the number itself.
        boolean isPrime = false;
        for (int i = 2; i <= n / 2; ++i) {
            if (n % i == 0) {
                isPrime = true;
                break;
            }
        }
        if (!isPrime) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is not a Prime Number");
        }
    }

    public static void main(String[] args) {
        int num;
        System.out.print("Enter a Number to check if its prime number: ");
        num = new Scanner(System.in).nextInt();
        //calling method
        primeNumber(num);
    }
}

