package hackerrank.practice;

import java.util.*;

public class MakingANagrams {
    static int makeAnagram(String a, String b) {
        int c=0;
        Map<Character, Integer> m1 = new HashMap<>();
        Map<Character, Integer> m2 = new HashMap<>();
        for(char x: a.toCharArray()){
            if (m1.containsKey(x))
                m1.put(x, m1.get(x)+1);
            else
                m1.put(x, 1);
//            if(b.indexOf(x)!=-1) {
//                c++;
//            }
        }
        for(char x: b.toCharArray()) {
            if (m2.containsKey(x))
                m2.put(x, m2.get(x) + 1);
            else
                m2.put(x, 1);
        }
        for(Map.Entry m: m1.entrySet()) {
            char key = (char)m.getKey();
            if(m2.containsKey(key)) {
                if(m2.get(key) != m.getValue())
                    c = Math.abs(m2.get(key) - (Integer)m.getValue());
            } else {

            }

        }
        return (a.length()-c)+(b.length()-c);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        int res = makeAnagram(a, b);
        System.out.println(res);
        scanner.close();
    }
}
