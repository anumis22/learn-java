package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test1111 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {

            String[] str = br.readLine().split(" ");
            int l = Integer.parseInt(str[0]);
            int r = Integer.parseInt(str[1]);

//            long out_ = solve(l, r);
//            System.out.println(out_);

        }

        wr.close();
        br.close();
    }

    private static void solve(int l, int r) {
        while(r-->0){

            long x = l;

            int k = l;

            boolean position = true;

            while(x!=0){

                if(x%k!=0){

                    x--;

                    if(x%k!=0){

                        System.out.println("NO");

                        position = false;

                        break;

                    }else{

                        x = x/k;

                    }

                } else {

                    x = x/k;

                }

            }

            if(position==true){

                System.out.println("YES");

            }

        }
    }
}
