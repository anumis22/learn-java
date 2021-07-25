package practice.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LeftRotation {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        List<Integer> result = leftRotate(arr, d);

        result.forEach(System.out::print);

        bufferedReader.close();
    }

    static List<Integer> leftRotate(List<Integer> a, int k) {
        int n = a.size();
        Integer[] oldArray = new Integer[n];
        oldArray = a.toArray(oldArray);
        Integer[] newArray = new Integer[n];
        // new index = (oldIndex+(n-k))%n , becos this value should not be greater than n
        for (int oldIndex=0;oldIndex<n;oldIndex++) {
            int newIndex = (oldIndex+ (n-k))%n;
            newArray[newIndex] = oldArray[oldIndex];
        }
        List<Integer> newList = Arrays.asList(newArray);
        return newList;
    }
}
