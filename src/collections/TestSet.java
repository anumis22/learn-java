package collections;

import java.util.*;

public class TestSet {
    public static void main(String[] args) {
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(5);
        l2.add(2);
        l2.add(4);
        l2.add(2);
        l2.add(5);
        HashSet<Integer> lhs = new LinkedHashSet<>(l2);
        l2.clear();
        for(Integer x:lhs){
            l2.add(x);
        }
        System.out.println(l2.toString());
    }
}
