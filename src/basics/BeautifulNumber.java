package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeautifulNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {

            String[] str = br.readLine().split(" ");
            int l = Integer.parseInt(str[0]);
            int r = Integer.parseInt(str[1]);

            long out_ = solve(l, r);
            System.out.println(out_);

        }

        br.close();
    }
    static long solve(int l, int r){
        // Your code goes here
        String string_l = Integer.toString(l);
        String string_r = Integer.toString(r);
        int sum1 = 0;
        int sum2 = 0;

        // Traversing through the string using for loop
        for (int i = 0; i < string_l.length(); i++) {

            // Printing the characters at each position
            int n = Character.getNumericValue(string_l.charAt(i));
            sum1 += n*n;
        }
        for (int i = 0; i < string_r.length(); i++) {

            // Printing the characters at each position
            int n = Character.getNumericValue(string_r.charAt(i));
            sum2 += n*n;
        }
        if(sumRecursive(l) && sumRecursive(r))
            return l+r;
        else if(sumRecursive(l))
            return l;
        else
            return r;
    }

    static boolean sumRecursive(int x) {
        int finalSum = 0;
        boolean isBeautiful = false;
        if(String.valueOf(x).length() == 1)
            return false;
        while(x>0 || finalSum>9) {
            if(x == 0) {
                x = finalSum;
                finalSum = 0;
            }
            finalSum += (x%10)*(x%10);
            x /=10;
            if(finalSum ==1){
                isBeautiful = true;
                break;
            }
        }
        return isBeautiful;
    }
}
