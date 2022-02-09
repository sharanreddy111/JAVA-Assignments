/**
 * 5.Write a function to remove a specific element from an array
 */
package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_05 {

    //function to remove a specific element from an array
    static void removeElement(int[] arr, int n) {
        for (int i = n; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        System.out.println("Array after removing Element at index " + n );
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] my_arr = {11, 22, 33, 44, 55, 66};
        System.out.print("Select an index to remove a value from arr = " + Arrays.toString(my_arr) + " : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //calling method
        removeElement(my_arr, a);
    }
}

