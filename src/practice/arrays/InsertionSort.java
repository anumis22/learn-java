package practice.arrays;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {12,11,13,5,15};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] arr) {
        for(int i=0;i<arr.length; i++) {
            for(int j=0;j<i+1;j++ ) {
                if(arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
