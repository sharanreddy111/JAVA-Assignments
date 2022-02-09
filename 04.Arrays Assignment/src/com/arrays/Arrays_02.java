/**
 * 2. Write a function to calculate the average value of an array of integers
 */
package com.arrays;

public class Arrays_02 {
    //method to calculate the average value
    static void avgArray(int[] arr) {
        int sum = 0;
        for (int i : arr) {  //for-each loop
            sum += i;
        }
        int average = sum / arr.length;
        System.out.print("The Average value of array is " + average);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        avgArray(arr);
    }
}
