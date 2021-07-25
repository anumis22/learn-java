package basics.leetcode;

import java.util.Arrays;

// For 17, replace it with largest number to its right and so on.
public class Test6 {
    public static void main(String[] args) {
        int[] a= {17,18,5,4,6,1};
        int max = a[a.length-1];
        a[a.length-1] = -1;
        for(int i=a.length-2;i>=0;i--) {
            int temp = a[i];
            a[i] = max;
            if(max<temp) {
                max = temp;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
