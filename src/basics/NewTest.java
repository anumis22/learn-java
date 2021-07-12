package basics;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class NewTest {
    public static void main(String[] args) {
        boolean found = true;
        String ab = "aabdcbpd";
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();
        for(int i=0;i<ab.length();i++) {
            if(charCountMap.get(ab.charAt(i)) != null)
                charCountMap.put(ab.charAt(i), charCountMap.get(ab.charAt(i))+1);
            else {
                charCountMap.put(ab.charAt(i), 1);
            }
        }
        for(Map.Entry<Character, Integer> m1: charCountMap.entrySet()) {
            if(m1.getValue() == 1) {
                System.out.println("Unique char: " + m1.getKey());
                found = true;
                break;
            }
            else
                found = false;
        }
        if(!found)
            System.out.println("Not found unique char");
    }
}
