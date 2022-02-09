/**
 * 7. Write a function to insert an element at a specific position in the array.
 */
package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_07 {
    static void insertElement(int[] arr, int p, int v) {

        for (int i = arr.length; i <= p; i--) {
            arr[i] = arr[i - 1];
        }
        arr[p] = v;
    }

    public static void main(String[] args) {
        int p, v;    //p == index number , v == value
        int[] my_arr = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        System.out.println("original Array : my_arr = " + Arrays.toString(my_arr));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index number : ");
        p = sc.nextInt();
        System.out.printf("Enter the value to insert at index my_arr[%d] =  ", p);
        v = sc.nextInt();

        insertElement(my_arr, p, v);

        System.out.println("Array after Inserting Element : ");
        System.out.println("my_arr = " + Arrays.toString(my_arr));
    }
}
