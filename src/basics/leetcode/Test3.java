package basics.leetcode;

import java.util.Arrays;

// Move all x elements to left and count the non-x elements
public class Test3 {
    public static void main(String[] args) {
        int[] a = {0,1,2,2,3,0,4,2};
        int x = 2;
        int left = 0, right=a.length-1;
        int count =0;
        while (left<right) {
            while (a[left]!=x && left<right)
                left++;
            while (a[right]==x && left<right)
                right--;
            if (left<right) {
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
            }
        }
        for(int i=0;i<a.length;i++) {
            if(a[i] == x) {
                break;
            }
            count++;
        }
        System.out.println(count);
        System.out.println(Arrays.toString(a));
    }
}
