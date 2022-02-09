/**
 * 17. Write a program to generate StringIndexOutOfBoundsException
 */
package com.exceptions;

public class Exceptions_17 {
    public static void main(String[] args) {

        String str = "Sharan";
        try {
            char charAtNegativeIndex = str.charAt(-1); // Trying to access at negative index
            char charAtLengthIndex = str.charAt(11); // Trying to access at index equal to size of the string
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("StringIndexOutOfBoundsException caught");
            e.printStackTrace();
        }
    }
}
