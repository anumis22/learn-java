package microsoft.practice;

import java.util.Arrays;
import java.util.List;

public class MaximumProduct {
    public static void main(String[] args) {
        int[] ar  = {10,-10, 10, -10};
        System.out.println(maximumPdt(Arrays.asList(10,-10,10,-10)));
    }

    static int maximumPdt(final List<Integer> A) {
        int max = A.get(0);
        for(int x=0;x<A.size();x++){
            int product = A.get(x);
            for (int y=x+1; y<A.size()-1;y++) {
                product = product < (product * A.get(y)) ? (product * A.get(y)) : product;
                max = max< product ? product : max;
            }
        }
        return max;
    }
}
