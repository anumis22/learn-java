package basics;

import java.util.*;

public class TestPresentations {
    public static void main(String[] args) {
        int c=0;
        List<Integer> l1 = Arrays.asList(1,3,5);
        int[] aa = l1.stream().mapToInt(i -> i).toArray();;
        List<Integer> l2 = Arrays.asList(2,2,2);
        for(int i=0;i<l1.size()-1;i++){
            if(l1.get(i)!=l1.get(i+1))
                c++;
        }
        System.out.println(c);

    }
}
