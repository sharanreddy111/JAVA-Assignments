/**
 * 3. Apply private, public, protected and default access modifiers to the constructor
 * 4. Write constructors with return type int and String
 * 5. Try to call the constructor multiple times with the same object
 */
package com.constructors;


public class Constructors_03_04_05 {
    int rollNo;
    String name;
    String clg;
    String city;

    //default access modifier
    Constructors_03_04_05() {
        this(11);
        System.out.println("Student Details");
    }

    //public access modifier
    public Constructors_03_04_05(int rollNo) {
        this("Sharan");
        this.rollNo = rollNo;
        System.out.println("rollNo : " + rollNo);
    }

    //private access modifiers
    private Constructors_03_04_05(String name) {
        this("ICFAI", "Hyderabad");
        this.name = name;
        System.out.println("Name : " + name);
    }

    //protected access modifiers
    protected Constructors_03_04_05(String clg, String city) {
        this.clg = clg;
        this.city = city;
        System.out.println("college : " + clg);
        System.out.println("City : " + city);
    }

    public static void main(String[] args) {
        //calling the constructor multiple times with the same object
        Constructors_03_04_05 c = new Constructors_03_04_05();
    }
    // NOTE : 4.Constructor looks like method but it is not. It does not have a return type
}




