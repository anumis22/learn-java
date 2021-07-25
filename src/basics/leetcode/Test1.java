package basics.leetcode;

import java.util.Arrays;

// Move zeroes to right and non-zero to left
public class Test1 {
    public static void main(String[] args) {
        int[] a = {0,1,0,3,12};
        moveZeroes(a);
    }

    public static void moveZeroes(int[] a) {
        int countOfNonZero = 0;
        for(int i=0;i<a.length;i++) {
            if(a[i] != 0) {
                a[countOfNonZero] = a[i];
                countOfNonZero++;
            }
        }
        for(int j=countOfNonZero;j<a.length;j++)
            a[j] =0;
        System.out.println(Arrays.toString(a));
    }

}
