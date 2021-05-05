package basics.nestedclass;

public class Outer {
    int outer_x = 10;
    Inner inner = new Inner();

    void test() {
        Inner inner = new Inner();
        System.out.println(inner.x);
        inner.display();
    }

    class Inner {
        int x = 10;
        void display() {
            System.out.println("display outer_x: "+outer_x);
        }
    }
}


