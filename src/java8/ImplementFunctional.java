package java8;

public class ImplementFunctional implements FunctionalInterface {
    @Override public void m1() {
        System.out.println(x);
    }

    public static void main(String[] args) {
        ImplementFunctional im = new ImplementFunctional();
        im.m1();
        Runnable e = () -> System.out.println("Runnable");
    }
}
