package practice.arrays;

import OOPS.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ToysSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] prices = new int[n];

        String[] pricesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pricesItem = Integer.parseInt(pricesItems[i]);
            prices[i] = pricesItem;
        }

        int result = maximumToys(prices, k);

        scanner.close();
    }

    static int maximumToys(int[] prices, int amount) {
        Arrays.sort(prices);
        System.out.println(Arrays.toString(prices));
        int count = 0;
        for(int i =0; i<prices.length ; i++){
            if (amount - prices[i]>=0) {
                count++;
                amount-= prices[i];
            }
        }
        return count;
    }
}
