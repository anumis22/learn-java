package hackerrank.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NewYearChaos {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        countSwaps(a);

        bufferedReader.close();
    }

    public static void countSwaps(List<Integer> a) {
        // Write your code here
        int count = 0;

        Integer[] arr = a.stream().toArray(Integer[]::new);
        int n=arr.length;

        for(int i=0;i<n-1;i++) {
            for(int j=0;j<n-1-i;j++) {
                if(arr[j+1]<arr[j])  {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    count++;
                }
            }
        }
        System.out.format("Array is sorted in %d swaps.\n",count);
        System.out.println("First Element: "+arr[0]);
        System.out.println("Last Element: "+arr[n-1]);
    }
}
