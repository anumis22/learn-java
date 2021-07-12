package OOPS;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Child extends Parent {
    public static void foo() {
        System.out.println("foo In child");
    }

    public String bar() {
        System.out.println("bar In child");
        return "Child";
    }

    public String bar(int x) {
        return "In x method";
    }


    public void add(double x)  {
        //        this.add();
        System.out.println("add in double");
    }

    static void m1() {
        System.out.println("in child static");
    }

    public static void main(String[] args) {
        Parent p = new Child();
        Parent p1 = new Parent();
        Child c = new Child();
        c.add(10);
       /* p.foo();
        p1.foo();
        c.foo();
        p.bar();
        c.bar();
        System.out.println(c.x);*/
        /*p.m1();
        c.m1();
        p.add();
        c.add();*/
    }
}

