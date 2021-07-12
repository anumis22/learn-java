package basics;

import OOPS.Parent;

public abstract class TestStaticSequence {

    // static variable
    static int a = m1();

    static int m2() {
        System.out.println("from m2");
        return 20;
    }
    // static block
    static {
        System.out.println("Inside static block");
    }

    // static method
    static int m1() {
        System.out.println("from m1");
        return 20;
    }


    public TestStaticSequence() {
        System.out.println("in parent constructor");
    }
}
