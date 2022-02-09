/**
 * 02. Call the constructors(both default and argument constructors) of super class from a child
 * class
 */
package com.constructors;

class ChildClass_02 extends ParentClass_01 {

    String clg;
    String city;

    //calling Parent class constructors using super() keyword
    ChildClass_02() {
        super();
    }

    ChildClass_02(int rollNo) {
        super(rollNo);
    }

    ChildClass_02(String name, String branch, String clg, String city) {
        super(name, branch);
        this.clg = clg;
        this.city = city;
        System.out.println("College : " + this.clg);
    }
}

public class Constructors_02 {
    public static void main(String... args) {
        new ChildClass_02();
        new ChildClass_02(317);
        new ChildClass_02("Sharan", "CSE", "ICFAI","Hyderabad");
    }
}
