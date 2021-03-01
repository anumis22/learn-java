package practice;

import java.util.Scanner;

public class Anagrams {
    Scanner scan = new Scanner(System.in);
    String a = scan.next();
    String b = scan.next();
        scan.close();
    boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
}
