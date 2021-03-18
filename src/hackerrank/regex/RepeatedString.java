package hackerrank.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatedString {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("a");
        Matcher m = p.matcher("abaabaabaa");
        int Count = 0;
        while(m.find()){
            Count += 1;
        }
        System.out.println(Count);
    }
}
