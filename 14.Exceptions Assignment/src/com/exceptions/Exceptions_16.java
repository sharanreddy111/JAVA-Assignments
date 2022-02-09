/**
 * 16. Write a program to generate NumberFormatException
 */
package com.exceptions;

public class Exceptions_16 {
    public static void main(String[] args) {

        String str = "111ABC";
        try {
            int x = Integer.parseInt(str); // Converting string with inappropriate format
            int y = Integer.valueOf(str);
        } catch (NumberFormatException e) {
            System.err.println("NumberFormatException caught!");
            e.printStackTrace();
        }
    }
}
