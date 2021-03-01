package practice;

import java.util.Scanner;

public class TestString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        getOrder(A, B);
        capitaliseFirstLetter(A, B);
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
