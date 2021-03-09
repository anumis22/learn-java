package practice;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class SortBigDecimal {

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        BigDecimal[] x = new BigDecimal[s.length];
        for(int i=0;i<n;i++){
            x[i]=BigDecimal(s[i]);
        }
        Arrays.sort((BigDecimal)s[0]);

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
