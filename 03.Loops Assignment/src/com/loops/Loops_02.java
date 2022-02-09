/**
 * 2. Write a java program to print 1 to 20 numbers using the while loop.
 */
package com.loops;

public class Loops_02 {
    public static void main(String[] args) {
        int i = 1;
        //In while loop we separately need to initialize and increment the variable
        while (i <= 20) {
            System.out.print(i + " ");
            //Every time the loop body is executed, this expression increments
            i++;
        }
    }
}
