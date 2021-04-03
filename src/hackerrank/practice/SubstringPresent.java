package hackerrank.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubstringPresent {
    static String twoStrings(String s1, String s2) {
        String res = "NO";

        for(char a: s1.toCharArray()){
            if(s2.indexOf(a)!=-1) {
                res = "YES";
                break;
            }
        }
        return res;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);
            System.out.println(result);
        }
        scanner.close();
    }
}
