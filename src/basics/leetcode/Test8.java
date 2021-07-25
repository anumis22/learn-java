package basics.leetcode;

import java.util.Arrays;

//sort and then square the numbers
public class Test8 {
    public static void main(String[] args) {
        int[] a = {-7,-3,2,3,11};
        int n=a.length;
        int l=0,r=n-1;
        int[] result = new int[n];
        for(int i=n-1;i>=0;i--) {
            if(Math.abs(a[l])> Math.abs(a[r])) {
                result[i] = a[l] * a[l];
                l++;
            } else {
                result[i] = a[r] * a[r];
                r--;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
