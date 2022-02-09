/**
 * 11.Write a program to find the common values between two arrays
 */
package com.arrays;

import java.util.Arrays;

public class Arrays_11 {
    static void commonValues(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println("Common values : " + arr1[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {11, 22, 33, 44, 55};
        int[] arr2 = {66, 55, 77, 11, 88};
        System.out.println("arr1[] = " + Arrays.toString(arr1));
        System.out.println("arr2[] = " + Arrays.toString(arr2));
        commonValues(arr1, arr2);
    }

}
