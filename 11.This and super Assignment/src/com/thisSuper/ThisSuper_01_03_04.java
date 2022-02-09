/**
 * 1. Print the fields/instance members of the current class using this and without using object
 * 3. Call constructor of the current class using this()
 * 4. Call argument constructor of current class using this()
 */
package com.thisSuper;

public class ThisSuper_01_03_04 {

    int num;
    String name;

    ThisSuper_01_03_04() {
        //3. Calling argument constructor of current class using this()
        this(11, "Sharan");
    }

    ThisSuper_01_03_04(int num, String name) {
        //1. Printing fields of the current class using this
        this.num = num;
        this.name = name;
        System.out.println(num + " " + name);
    }

    public static void main(String[] args) {
        ThisSuper_01_03_04 ts1 = new ThisSuper_01_03_04();
        ThisSuper_01_03_04 ts = new ThisSuper_01_03_04(12, "Jala");
    }
}
