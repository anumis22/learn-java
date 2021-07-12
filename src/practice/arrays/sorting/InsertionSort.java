package practice.arrays.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {12,11,13,5,15};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] a) {
        int key,j;
        for(int i=1;i<a.length; i++) {
            key = a[i];
            j = i-1;
            while(j>=0 && a[j] > key) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1]=key;
        }
    }
}
