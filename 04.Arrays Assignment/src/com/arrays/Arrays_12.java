/**
 * 12. Write a method to remove duplicate elements from an array
 */
package com.arrays;

import java.util.Arrays;

public class Arrays_12 {
    static int removerDuplicate(int[] arr, int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        // creating another array for only storing the unique elements
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];
        // Changing the original array
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        return j;
    }

    public static void main(String[] args) {
        int[] arr = {11, 22, 22, 33, 44, 44, 55, 66, 66};
        System.out.println("arr[] = " + Arrays.toString(arr));
        int n = arr.length;

        n = removerDuplicate(arr, n);

        // Printing The new array elements
        System.out.println("Array after removing duplicate values : ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}



