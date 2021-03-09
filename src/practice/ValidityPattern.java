package practice;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class ValidityPattern {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        String[] validityArr = new String[testCases];
        int i =0;
        while(testCases>0){
            String pattern = in.nextLine();
            //Write your code
            try {
                Pattern.compile(pattern);
                validityArr[i] = "Valid";
            } catch (PatternSyntaxException p) {
                validityArr[i] = "Invalid";
            }
            i++;
            testCases--;
        }
        for (int j=0; j<validityArr.length; j++) {
            System.out.println(validityArr[j]);
        }
    }
}
