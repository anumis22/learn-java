package basics;

import java.io.IOException;

public class Testtt {
    public static void main(String[] args) {
        try {
            int x= 2;
            throw new Exception("throw");
        } catch (Exception e) {
            System.out.println("in catch");
        }
    }

    static int maxSubsetSum(int[] arr) {
        int sum = 0;
        for(int i=0;i<arr.length;i++) {
            int j =i+2;
            int temp = 0;
            while( j < arr.length) {
                temp += arr[j];
                j = j+2;
            }
            if (arr[i] + temp > sum)
                sum = arr[i] + temp;
        }
        System.out.println(sum);
        return sum;
    }
}
