package practice.arrays;

public class NegativeSums {
    public static void main(String[] args) {
        int[] a = {1, -2, 4, -5, 1};
        int count = 0;
        for(int i=0;i<5;i++) {
            if(a[i]<0)
                count++;
        }
    }
}
