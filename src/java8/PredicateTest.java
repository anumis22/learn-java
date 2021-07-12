package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Predicate;
import java.util.stream.Stream;

// return only boolean
// accepts one parameter (the input type)
public class PredicateTest {
    public static void main(String[] args) {
        Predicate<Integer> p = i->i>3;
        System.out.println(p.test(12));
        System.out.println(p.test(2));
        Predicate<String> predicate = p1 -> p1.length() == 21;
        Predicate<String> predicate1 = p1 -> p1.length() > 3;
        List<String> stringList = new ArrayList<>();
        stringList.add("asd");
        stringList.add("fdasd");
        Spliterator<String> it=stringList.spliterator();
        it.forEachRemaining(n -> System.out.println(n));
        /*stringList.removeIf(predicate1);
        System.out.println(stringList);*/
    }
}
