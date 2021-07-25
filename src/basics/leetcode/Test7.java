package basics.leetcode;

import java.io.*;

public class Test7 {
    public static void main(String[] args) {
        int[] a = {1,0,0,1,1,0,1,1};
        int result = 0;
        int count = 0;
        for(int i=0;i<a.length;i++) {
            if(a[i]==1) {
                count++;
            } else
                count = 0;
            if(result<count)
                result = count;
        }
        System.out.println(result);
    }
}
