package java8;

import java.util.function.Function;

// return any type
// accepts 2 parameters (1st is the input type, 2nd is return type)
public class FunctionTest {
    public static void main(String[] args) {
        Function<String, Integer> f1 = s->s.length();
        System.out.println(f1.apply("anumishra"));

    }
}
