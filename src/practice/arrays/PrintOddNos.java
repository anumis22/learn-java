package practice.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Result1 {

    /*
     * Complete the 'oddNumbers' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER l
     *  2. INTEGER r
     */

    public static List<Integer> oddNumbers(int l, int r) {
        List<Integer> l1 = new ArrayList<>();
        for(int i=l;i<=r;i++) {
            if(i%2!=0)
                l1.add(i);
        }
        return l1;
    }

}
public class PrintOddNos {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(bufferedReader.readLine().trim());
        int r = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> result = Result1.oddNumbers(l, r);
        for(int i=0;i<result.size();i++) {
            System.out.println(result.get(i));
        }
        bufferedReader.close();
    }
}
