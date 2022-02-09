/**
 * 11.Write a program to generate FileNotFoundException
 */
package com.exceptions;

import java.io.*;

// FileNotFoundException occurs when we attempt to open the file denoted by a specified pathname has failed.
public class Exceptions_11 {
    public static void main(String[] args) {

        try {
            // create instance of the BufferedReader and pass the FileReader instance to it.
            BufferedReader reader = new BufferedReader(new FileReader(new File("/invalid/file/location")));
        }
        //FileNotFoundException is a subclass of IOException.
        catch (FileNotFoundException e) {
            System.err.println("FileNotFoundException caught!");
            e.printStackTrace();
        }
    }
}
