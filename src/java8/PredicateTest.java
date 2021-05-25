package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

// return only boolean
// accepts one parameter (the input type)
public class PredicateTest {
    public static void main(String[] args) {
        Predicate<Integer> p = i->i>10;
        System.out.println(p.test(12));
        System.out.println(p.test(2));
        Predicate<String> predicate = p1 -> p1.length() == 21;
        List<String> stringList = Arrays.asList("asd","dsfref");
        Stream<String> stream = stringList.stream().filter(predicate);
    }
}
