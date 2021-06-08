package regex;

import java.util.regex.Pattern;

public class Test1 {
    public static void main(String[] args) {
        String regex = "\\?a";
        String a = "aa";
        Pattern x = Pattern.compile(regex);
        System.out.println(x.matcher(a));
        System.out.println(a.matches(regex));
    }
}
