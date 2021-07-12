package java8;

import java.util.Arrays;
import java.util.Date;

public class ArrayElementIncrement {

    public static void main(String[] args) {
        long[] array = new long[100];
        for(int i=0;i<100; i++) {
            array[i] = i+2;
        }
        long time1 =System.currentTimeMillis();
        Arrays.parallelSetAll(array, x -> array[x] + 1);
        long time2 = System.currentTimeMillis();
        System.out.println(time2-time1);

        long[] arr = new long[array.length];

        long time3 =System.currentTimeMillis();

        for(int i=0; i<array.length;i++) {
            arr[i] = array[i] +1;
        }
        long time4 =System.currentTimeMillis();
        System.out.println(time2-time1);
        System.out.println("new array = " + Arrays.toString(arr));
    }


}
