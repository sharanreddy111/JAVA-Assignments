/**
 * 8. Write a function to find the minimum and maximum value of an array
 */
package com.arrays;

import java.util.Arrays;

public class Arrays_08 {

    static int minValue(int[] arr) {
        //int result = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] < min)
                min = arr[i];
        return min;
    }

    static int maxValue(int[] arr) {
        // int result = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
        return max;
    }

    public static void main(String[] args) {
        int[] my_arr = {11, 22, 33, 44, 55, 66};
        System.out.println("my_arr = " + Arrays.toString(my_arr));
        System.out.println("The Maximum value = " + maxValue(my_arr));
        System.out.println("The Minimum value = " + minValue(my_arr));
    }
}


