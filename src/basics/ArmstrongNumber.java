package basics;

import javax.xml.transform.Result;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArmstrongNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int[][] array = new int[arr.size()][arr.size()];
        for(int i=0;i<arr.size();i++) {
            for(int j=0;j<arr.size();j++) {
                array[i][j] = arr.get(i).get(j);
            }
        }
        for(int i=0;i<arr.size();i++) {
            for(int j=0;j<arr.size();j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }

        int result = diagonalDifference(arr);

        System.out.println(result);
    }

    public static long aVeryBigSum(List<Long> ar) {
        long result = ar.stream().mapToLong(Long::longValue).sum();
        return result;
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int d1 = 0, d2 = 0;


        return Math.abs(d1 - d2);
    }
}
