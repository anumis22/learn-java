package basics.leetcode;

public class Test4 {
    public static void main(String[] args) {
        int[] a = {123,2345,223};
        int evenCount = 0;
        for(Integer x:a) {
            if(countDigits(x) %2 == 0)
                evenCount++;
        }
        System.out.println(evenCount);
    }
    static int countDigits(int x) {
        int c=0;
        while(x!=0) {
            x /=10;
            c++;
        }
        return c;
    }
}
