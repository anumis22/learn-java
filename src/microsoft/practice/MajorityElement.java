package microsoft.practice;

import java.util.*;

public class MajorityElement {

    public static void main(String[] args) {
        System.out.println(majorityElement(Arrays.asList(100)));
    }

    public static int majorityElement(final List<Integer> A) {
        int halfLen = A.size()/2;
        int majorityNum = A.size()==1 ? A.get(0) : 0;
        Map<Integer, Integer> map = new HashMap<>();
        Iterator<Integer> it = A.iterator();
        while (it.hasNext()){
            Integer key = it.next();
            if(map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
                if(map.get(key)>halfLen) {
                    majorityNum = key;
                    return majorityNum;
                }
            }
            else
                map.put(key, 1);
        }
        return majorityNum;
    }
}
