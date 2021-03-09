package practice;

import java.util.Scanner;
import java.util.StringTokenizer;

public class PrintValidTagContents {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();

            printContent(line);

            testCases--;
        }
    }

    static void printContent(String line) {
        StringTokenizer st = new StringTokenizer(line);
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
