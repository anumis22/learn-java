package hackerrank.practice;

import java.util.Arrays;
import java.util.Scanner;

public class MinAbsDifference {
    static int minimumAbsoluteDifference(int[] arr) {
        Arrays.sort(arr);

        int minimumDifference = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            int difference = arr[i + 1] - arr[i];

            if (difference < minimumDifference) {
                minimumDifference = difference;

                if (minimumDifference == 0) {
                    return 0;
                }
            }
        }

        return minimumDifference;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int[] arr = new int[n];
        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        int result = minimumAbsoluteDifference(arr);
        System.out.println(result);
        scanner.close();
    }
}
