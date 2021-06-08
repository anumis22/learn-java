package microsoft.practice;

import java.util.HashSet;
import java.util.Set;

public class FindSum {
    public static void main(String[] args) {
        int[] v = new int[] {5, 7, 1, 2, 8, 4, 3};
        int[] test = new int[] {3, 20, 1, 2, 7};

        for(int i = 0; i < test.length; i++){
            boolean output = findSumOfTwo(v, test[i]);
            System.out.println("findSumOfTwo(v, " + test[i] + ") = " + (output ? "true" : "false"));
        }
    }

    static boolean findSumOfTwo(int[] A, int value){
        Set<Integer> foundValues = new HashSet<>();
        for(int a: A) {
            if(foundValues.contains(value - a))
                return true;

            foundValues.add(a);
        }
        return false;
    }
}
