package practice.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Result {

    /*
     * Complete the 'findNumber' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY arr
     *  2. INTEGER k
     */

    public static String findNumber(List<Integer> arr, int k) {
        String res = "NO";
        for(int i=0;i<arr.size();i++) {
            if(arr.get(i) == k) {
                res = "YES";
                break;
            }
        }
        return res;
    }

}
public class FindTheNumber {
    public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i < arrCount; i++) {
                int arrItem = Integer.parseInt(bufferedReader.readLine().trim());
                arr.add(arrItem);
            }

            int k = Integer.parseInt(bufferedReader.readLine().trim());

            String result = Result.findNumber(arr, k);
            System.out.println(result);
            bufferedReader.close();
        }
}
