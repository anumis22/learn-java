package practice.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeftRotation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        List newList = new ArrayList(5);
        newList.add(arr);
        leftRotate(newList, 3);
    }

    static List<Integer> leftRotate(List<Integer> a, int k) {
        int n = a.size();
        Integer[] oldArray = new Integer[n];
        oldArray = a.toArray(oldArray);
        Integer[] newArray = new Integer[n];
        List newList = new ArrayList(n);
        // new index = (oldIndex+(n-k))%n , becos this value should not be greater than n
        for (int oldIndex=0;oldIndex<n;oldIndex++) {
            int newIndex = (oldIndex+ (n-k))%n;
            newArray[newIndex] = oldArray[oldIndex];
        }
        newList.add(newArray);
        return newList;
    }
}
