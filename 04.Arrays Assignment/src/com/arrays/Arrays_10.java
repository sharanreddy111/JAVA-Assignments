/**
 * 10.Write a function to find the duplicate values of an array
 */
package com.arrays;

import java.util.Arrays;

public class Arrays_10 {

    static void duplicateValues(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] == arr[j] && (i != j))) {
                    System.out.println("Duplicate values : " + arr[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] my_arr = {11, 22, 33, 44, 55, 22, 44, 33};
        System.out.println("my_arr[] = " + Arrays.toString(my_arr));

        duplicateValues(my_arr);
    }
}
