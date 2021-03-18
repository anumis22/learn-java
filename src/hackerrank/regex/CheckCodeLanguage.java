package hackerrank.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class CheckCodeLanguage1 {
    public static void main(String[] args) {
        CheckCodeLanguage tester = new CheckCodeLanguage();
        tester.checker("(scanf|printf|#include)");
    }
}

class CheckCodeLanguage {

    public void checker(String Regex_Pattern){

        String x = "import java.io.*;\n" + "    public class SquareNum {\n"
            + "       public static void main(String args[]) throws IOException\n" + "       {\n"
            + "          System.out.println(\"This is a small Java Program!\");\n" + "       }\n"
            + "    }";
        if(x.contains("System.out.println"))
            System.out.println("Java");
        else if(x.contains("#include"))
            System.out.println("C");
        else
            System.out.println("Python");
    }
}
