/**
 * 16. Write a function to get the difference of largest and smallest value
 */
package com.arrays;

import java.util.Arrays;

public class Arrays_16 {
    static void difference_Min_Max(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int difference;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        difference = max - min;
        System.out.printf("Maximum value : %d , Minimum value : %d ", max, min);
        System.out.println("\nDifference of largest and smallest values : " + difference);
    }

    public static void main(String[] args) {
        int[] my_arr = {11, 22, 33, 44, 55};
        System.out.println("my_arr[] = " + Arrays.toString(my_arr));

        difference_Min_Max(my_arr);
    }

}
