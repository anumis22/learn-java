package practice.arrays.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] arr) {
        for(int i=0;i<arr.length; i++) {
            for(int j=i+1;j<arr.length;j++ ) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
