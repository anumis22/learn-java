package hackerrank.practice;

import java.util.Scanner;

public class DeleteMatchingChars {
    static int alternatingCharacters(String s) {
        int c = 0;
        for(int i=0;i<s.length()-1;i++) {
            if(s.charAt(i) == s.charAt(i+1))
                c++;
        }
        return c;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();
            int result = alternatingCharacters(s);
            System.out.println(result);
        }
        scanner.close();
    }
}
