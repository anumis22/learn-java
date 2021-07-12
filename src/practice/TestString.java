package practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class QuickSort {
    int partition(int[] a, int p, int q) {
        int pivot =q;
        int i= p-1;
//        for(int j=p; j<pivot)
        return 0;
    }
}
public class TestString {
    public static void main(String[] args) {

        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
       /* for()
        System.out.println(sb.toString());*/
    }

    static void capitaliseFirstLetter(String A, String B) {
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1,A.length())+
            B.substring(0,1).toUpperCase()+B.substring(1,B.length()));
    }

    static void getOrder(String a, String b) {
        boolean flag = true;
        for (int i=0; i<a.length(); i++){
            if(a.charAt(i) < b.charAt(i)) {
                break;
            } else if(a.charAt(i) == b.charAt(i))
                continue;
            else {
                flag = false;
                break;
            }
        }
        if (flag)
            System.out.println("No");
        else
            System.out.println("Yes");
    }
}
