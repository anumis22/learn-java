package regex;

import java.util.regex.Pattern;

public class Test1 {
    public static void main(String[] args) {
        String regex = "\"\\s*cat\\s*\"";
        String a = "The fat cat sat on the concatenation.";
        Pattern x = Pattern.compile(regex);
        System.out.println(x.matcher(a));
        System.out.println(a.matches(regex));
    }
}
