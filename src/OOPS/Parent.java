package OOPS;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Parent {
    int x= 20;
    public static void foo() {
        System.out.println("foo In parent");
    }

    public Object bar() {
        System.out.println("bar In parent");
        return "parent";
    }

    public void add(int x) {
        System.out.println("add in parent");
    }

    static void m1() {
        System.out.println("in parent static");
    }
}
