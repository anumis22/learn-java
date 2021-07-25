package practice.linkedlist;

import java.util.Arrays;

class CheckAnagrams {

    static boolean areAnagram(String str1, String str2)
    {
        int n1 = str1.length();
        int n2 = str2.length();

        // If length of both strings is not same, then they cannot be anagram
        if (n1 != n2)
            return false;

        char[] strChar1 = str1.toCharArray();
        Arrays.sort(strChar1);
        char[] strChar2 =str2.toCharArray();
        Arrays.sort(strChar2);
        return Arrays.equals(strChar1, strChar2);
    }

    public static void main(String args[])
    {
        String str1 ="listen";
        String str2 ="silent";

        if (areAnagram(str1, str2))
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");
    }
}
