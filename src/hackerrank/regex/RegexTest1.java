package hackerrank.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexTest {

    public static void main(String[] args) {

        RegexTest1 tester = new RegexTest1();
//        tester.checker("^[^0-9][^aeiou][^bcDF][^\\s][^AEIOU][^,\\.]$");
        tester.checker("^([a-z]\\w\\s\\W\\d\\D[A-Z][a-zA-Z][aeiouAEIOU]\\S)\\1$");

    }
}

class RegexTest1 {

    public void checker(String Regex_Pattern){

        Scanner Input = new Scanner(System.in);
//        String Test_String = Input.nextLine();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher("Mr.V.K. Doshi");
        System.out.println(m.find());
    }
}
