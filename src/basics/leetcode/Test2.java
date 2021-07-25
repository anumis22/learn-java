package basics.leetcode;

import java.util.Arrays;

// Move even to left and odd to right
public class Test2 {
    public static void main(String[] args) {
        int[] a={12, 34, 45, 9, 8, 90, 3};
        int left = 0, right=a.length-1;
        while (left<right) {
            while (a[left]%2==0 && left<right)
                left++;
            while (a[right]%2!=0 && left<right)
                right--;
            if (left<right) {
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }
        } System.out.println(Arrays.toString(a));
    }
}
