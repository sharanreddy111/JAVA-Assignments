/**
 * 12. Print gender (Male/Female) program according to given M/F using switch.
 */
package com.loops;

import java.util.Scanner;

public class Loops_12 {
    public static void main(String[] args) {

        System.out.print("Enter a Character (M/F)  : ");
        Scanner sc = new Scanner(System.in);
        char Gender = sc.next().charAt(0);

        switch (Gender) {
            case 'M':
                System.out.println("Gender is Male");
                break;
            case 'F':
                System.out.println("Gender is Female");
                break;
        }
    }
}

