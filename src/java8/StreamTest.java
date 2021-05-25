package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(3, 2, 5, 4, 6, 3);

        //map function
        List incrementedList = number.stream().map(x->x+1).collect(Collectors.toList());
        System.out.println(incrementedList);
        //filter
        List filteredList = number.stream().filter(x->x%2 == 0).collect(Collectors.toList());
        System.out.println(filteredList);
        //sort
        Set sortedList = number.stream().collect(Collectors.toSet());
        System.out.println(sortedList);
        //forEach
        number.stream().forEach(x-> System.out.println(x*2));
    }
}
