package practice.stringtest;

import java.util.Scanner;

public class StringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        printTokens(s.trim());
        scan.close();
    }

    static void printTokens(String x) {
        String delims = "[ !,?._'@\\s]+";
        String a = x.trim();
        //s.split("[!,?._'@\\s]+");
        String[] newString = x.split(delims);
        System.out.println(newString.length);
        for(int i=0;i<newString.length;i++)
            System.out.println(newString[i]);
    }
}
