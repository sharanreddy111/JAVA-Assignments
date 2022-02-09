/**
 * 4.Write text to a .txt file using BufferedOutputStream
 */
package com.javaIO;

import java.io.*;

//writing bytes is faster using BufferedOutputStream
public class IO_04 {

    public static void main(String[] args) {
        String s = "This text is written using BufferedOutputStream.";

        try {
            // Creates a FileOutputStream
            FileOutputStream fos = new FileOutputStream("bos.txt");
            //the internal buffer has the default size of 8192 bytes.
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            byte[] arr = s.getBytes();
            // Writes data to the output stream
            bos.write(arr);
            bos.close();
            fos.close();
            System.out.println("Data is written to the file.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
