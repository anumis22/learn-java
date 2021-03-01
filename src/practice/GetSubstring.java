package practice;

import java.io.*;

class Result1 {

    /*
     * Complete the 'findSubstring' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String findSubstring(String s, int k) {
        // Write your code here
        String withMaxVowels = "Not Found!";
        int count = 0;
        int maxVowels = 0;
        for (int i=0; i<=(s.length()-k); i++) {
            String temp = s.substring(i, i+k);
            char[] arr = temp.toCharArray();
            for (int j=0; j<arr.length; j++) {
                if(arr[j]=='a' || arr[j]=='e' || arr[j]=='i' ||
                    arr[j]=='o' || arr[j]=='u')
                    count++;
            }
            if(count > maxVowels) {
                maxVowels = count;
                withMaxVowels = temp;
            }
            count = 0;
        }
        return withMaxVowels;
    }

}

public class GetSubstring {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result1.findSubstring(s, k);
        System.out.println(result);

//        bufferedWriter.write(result);
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
