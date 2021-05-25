package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LambdaTest {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2,3,4,5,3);
        Set square = number.stream().map(x->x*x).collect(Collectors.toSet());
        System.out.println(square);

        List<Integer> number1 = Arrays.asList(2,3,4,5);
        int even = number1.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
        System.out.println(even);
    }
}
