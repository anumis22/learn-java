package practice.arrays.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {12,11,13,5,15};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] a) {
        for(int i=1;i<a.length; i++) {
            int current = a[i];
            int j = i;
            while(j>0 && a[j-1]>current) {
                a[j] = a[j-1];
                j--;
            }
            a[j] = current;
        }
    }
}
