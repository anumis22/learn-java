package OOPS;

public class Child extends Parent {
    public static void foo() {
        System.out.println("foo In child");
    }

    public void bar() {
        System.out.println("bar In child");
    }

    public void add() {
        System.out.println("add in child");
    }

    static void m1() {
        System.out.println("in child static");
    }

    public static void main(String[] args) {
        Parent p = new Child();
        Parent p1 = new Child();
        Child c = new Child();
        p.foo();
        p1.foo();
        c.foo();
        p.bar();
        c.bar();
        /*p.m1();
        c.m1();
        p.add();
        c.add();*/
    }
}

