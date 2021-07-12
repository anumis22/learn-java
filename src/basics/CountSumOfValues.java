package basics;

import java.util.HashMap;
import java.util.Map;

public class CountSumOfValues {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 5, 7, -1, 5 };
        int sum = 6;
        System.out.println(
            "Count of pairs is "
                + getPairsCOunt(arr, sum));
    }

    static int getPairsCOunt(int arr[], int sum) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i]))
                map.put(arr[i],1);
            else
                map.put(arr[i],map.get(arr[i])+1);
        }
        int count = 0;

        for(int i=0;i<arr.length;i++){
            if(map.get(sum-arr[i])!=null)
                count += map.get(sum-arr[i]);
            if(sum-arr[i] == arr[i])
                count--;
        }
        return count/2;
    }
}
