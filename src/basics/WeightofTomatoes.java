package basics;

import java.util.HashMap;
import java.util.Map;

public class WeightofTomatoes {
    public static void main(String[] args) {
        int[] arr = {750,250,500,400,250};
        Map<Integer, Integer> map = new HashMap<>();
        for(int x:arr) {
            int count = map.get(x);
            map.put(x, count+1);
        }
    }
}
