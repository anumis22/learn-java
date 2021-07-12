package basics;

import java.io.*;
import java.util.StringTokenizer;

public class SplitString {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\anu1.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null) {
            splitIntoLine(st);
        }
    }

    public static void splitIntoLine(String st){
        StringTokenizer tok = new StringTokenizer(st, " ");
        StringBuilder output1 = new StringBuilder(st.length());
        int lineLength = 0;
        int i = 1;
        while (tok.hasMoreTokens()) {
            String word = tok.nextToken();

            while(word.length() > 160){
                output1.append(word.substring(0, 160-lineLength)).append("(").append(i).append(")").append("\n");
                word = word.substring(160-lineLength);
                lineLength = 0;
                i++;
            }

            if (lineLength + word.length() > 160) {
                output1.append("(").append(i).append(")").append("\n");
                lineLength = 0;
                i++;
            }
            output1.append(word + " ");

            lineLength += word.length() + 1;
        }
        output1.append("(").append(i).append(")");
        System.out.println(output1.toString());
    }
}
