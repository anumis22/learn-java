package basics.leetcode;

import java.util.Arrays;

//Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.
//Note that elements beyond the length of the original array are not written.
public class Test9 {
    public static void main(String[] args) {
        int[] a = {1,0,2,3,0,4,5,0};
        for(int i=0;i<a.length;i++) {
            if(a[i] == 0) {
                int j=a.length-1;
                while(j != i)
                {
                    a[j]=a[j-1];
                    j--;
                }
                i=i+2;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
