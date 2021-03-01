package practice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        boolean isPalindrome = true;

        for (int i= 0, j=A.length()-1 ; i<A.length(); i++, j--) {
            if (!(A.charAt(i) == A.charAt(j))) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
