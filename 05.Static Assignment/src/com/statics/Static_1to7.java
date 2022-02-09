/**
 * 1. Write a class with 2 static variables, 2 Instance variables, 2 static methods, 2 instance
 * methods and a main method.
 * 2. Print instance variables in static methods
 * 3. Print static variables in Instance methods
 * 4. Call instance methods in static methods
 * 5. Call static methods in instance methods
 * 6. Print all the static, instance variables in main method
 * 7. Call static methods and instance methods in main method
 */
package com.statics;

public class Static_1to7 {

    // Static variables
    static int sv1 = 11;
    static int sv2 = 22;

    // Instance variables
    int iv1 = 33;
    int iv2 = 44;

    // 2. Prints Instance variables in Static method 1
    static void staticMethod1() {
        Static_1to7 obj = new Static_1to7();
        System.out.println("Instance variables: " + obj.iv1 + ", " + obj.iv2);
    }

    // 3. Prints Static variables in Instance method 1
    void instanceMethod1() {
        System.out.println("Static variables: " + sv1 + ", " + sv2);
    }

    // 4. Calls Instance method 1 in Static method 2
    static void staticMethod2() {
        //we can not call the instance methods directly,so we create an object
        Static_1to7 obj = new Static_1to7();
        obj.instanceMethod1();
    }

    // 5. Call Static methods in Instance method 2
    void instanceMethod2() {
        //static methods can be called without creating an object of class
        staticMethod1();
    }

    //main method
    public static void main(String[] args) {
        Static_1to7 stc = new Static_1to7();

        // 8. Print all the static, instance variables in main method
        System.out.println("Static variables: " + sv1 + ", " + sv2);
        System.out.println("Instance variables: " + stc.iv1 + ", " + stc.iv2);

        // 7.Call static methods and instance methods in main method
        staticMethod1();
        staticMethod2();
        stc.instanceMethod1();
        stc.instanceMethod2();
    }
}
