package basics.leetcode;

import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) {
        int[] a = {1,2,2,0,0,0};
        int count =0;
        for(int i=0;i<a.length;i++) {
            if((i+1)< a.length && a[i] == a[i+1])
                continue;
            a[count++] = a[i];
        }
        System.out.println(count);
        System.out.println(Arrays.toString(a));
    }

}
