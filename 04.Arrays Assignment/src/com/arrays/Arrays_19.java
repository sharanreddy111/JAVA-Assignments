/**
 * 19. Write a function to find the missing number of sorted array of 1 to 100
 */
package com.arrays;

import java.util.Arrays;

public class Arrays_19 {
    static void missingNumber(int[] arr) {
        Arrays.sort(arr);
        System.out.println("a[] = " + Arrays.toString(arr));
        int j = 0;
        for (int i = 1; i < 100; i++) {
            if (j < arr.length && i == arr[j])
                j++;
            else
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] my_arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        missingNumber(my_arr);
    }
}
