package practice.arrays.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {12,11,13,5,15};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] arr) {
        for(int i=0;i<arr.length-1; i++) {
            for(int j=0;j<arr.length-i-1;j++ ) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
