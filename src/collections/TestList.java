package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(5);
        for(int i=0;i<5;i++) {
            l1.add(i);
        }
        List<Integer> l2 = Arrays.asList(2,5,4,5);
        l1.retainAll(l2);
        System.out.println(l1);

        List<Integer> l3 = Collections.unmodifiableList(l1);
        l3.add(67);
        System.out.println(l3.toArray().toString());
    }
}
