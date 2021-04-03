package hackerrank.practice;

import java.io.IOException;
import java.util.*;

public class SherlockString {
    static String isValid(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char x: s.toCharArray()) {
            if (map.containsKey(x))
                map.put(x, map.get(x)+1);
            else
                map.put(x, 1);
        }
        Set<Integer> countSet = new HashSet<>();
        countSet.addAll(map.values());
        System.out.println(countSet);
        return null;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        String result = isValid(s);
        System.out.println(result);
        scanner.close();
    }
}
