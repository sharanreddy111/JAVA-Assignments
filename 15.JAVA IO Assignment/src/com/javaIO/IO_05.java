/**
 * 5.Write a program to read text from .txt file using FileReade
 */
package com.javaIO;

import java.io.FileReader;

// FileReader class is used to write character-oriented data to a file.
public class IO_05 {
    public static void main(String[] args) {

        try {
            // Creates a FileReader
            FileReader fr = new FileReader("fw.txt");

            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
            //closing FileReader
            fr.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
