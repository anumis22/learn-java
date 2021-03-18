package practice.arrays;

import java.util.Scanner;

public class FindMatchingStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stringsCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String[] strings = new String[stringsCount];
        for (int i = 0; i < stringsCount; i++) {
            String stringsItem = scanner.nextLine();
            strings[i] = stringsItem;
        }
        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String[] queries = new String[queriesCount];
        for (int i = 0; i < queriesCount; i++) {
            String queriesItem = scanner.nextLine();
            queries[i] = queriesItem;
        }
        int[] res = matchingStrings(strings, queries);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
        scanner.close();
    }

    static int[] matchingStrings(String[] strings, String[] queries) {
        int[] count = new int[queries.length];
        for(int i =0 ; i<queries.length; i++) {
            for(String str: strings) {
                if(queries[i].equals(str))
                    count[i]++;
                }
        }
        return count;
    }
}
