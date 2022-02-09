/**
 * 3. Write a program to find the index of an array element.
 */
package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_03 {

    //method to find the index of an array element.
    static void arrIndex(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            //executes if given input matches
            if (n == arr[i]) {
                System.out.println(n + " is at index " + i);
                return;
            }
        }
    }

    public static void main(String[] args) {
        int n;
        int[] arr = {11, 22, 33, 44, 55, 66, 77};
        System.out.println("arr = " + Arrays.toString(arr));
        //user input
        System.out.print("Select any value to find Index of array : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextByte();
        //calling method
        arrIndex(arr, n);
    }
}
