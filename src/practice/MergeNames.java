package practice;

import java.util.*;

public class MergeNames {

    public static String[] uniqueNames(String[] arr1, String[] arr2) {
        String[] arr = new String[arr1.length + arr2.length];
        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
            count++;
        }

        for (int j = 0; j < arr2.length; j++) {
            arr[count++] = arr2[j];
        }
        Set set = new HashSet(Arrays.asList(arr));
        System.out.println(set);
        arr = new String[set.size()];
        set.toArray(arr);
        return arr;
    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}
