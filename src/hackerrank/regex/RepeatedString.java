package hackerrank.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatedString {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("(ze|se)");
        String x = "hackerrank has such a good ui that it takes no time to familiarise its environment\n"
            + "to familiarize oneself with ui of hackerrank is easy";
        String[] arr = x.split(" ");
            int Count = 0;
        for(int i=0;i<arr.length;i++){
            Matcher m = p.matcher(arr[i]);
            while(m.find()){
                Count += 1;
            }
        }

        System.out.println(Count);
    }
}
