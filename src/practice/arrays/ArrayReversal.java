package practice.arrays;

import java.util.Arrays;

public class ArrayReversal {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,5};
        reverse(arr);
    }

    static void reverse(int[] a) {
        for(int i=0,j=a.length-1; i<(a.length/2); i++, j--) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
