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

    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();
        /*p.foo();
        c.foo();
        p.bar();
        c.bar();*/
        p.add();
        c.add();
    }
}

