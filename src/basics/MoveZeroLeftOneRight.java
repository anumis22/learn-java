package basics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MoveZeroLeftOneRight {
    public static void main(String[] args) {
        int[] arr= {0, 1, 0, 1, 0, 0, 1, 1, 0};
        int n=arr.length;
//        moveElements(arr, n);
        anotherMethod(arr, n);
    }

    private static void anotherMethod(int[] arr, int n){
        int left = 0, right = n-1;
        while(left<right) {
            while(arr[left] == 0 && left<right)
                left++;

            while(arr[right] == 1 && left<right)
                right--;

            if(left<right) {
                arr[left] =0;
                arr[right] =1;
                left++;
                right--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    private static void moveElements(int[] arr, int n) {
        int countOfZero = 0;
        for(int i=0;i<n;i++) {
            if(arr[i] == 0)
                countOfZero++;
        }
        for(int i=0;i<countOfZero;i++) {
            arr[i] = 0;
        }
        for(int i=countOfZero;i<n;i++)
            arr[i]=1;

        System.out.println(Arrays.toString(arr));
    }
}
