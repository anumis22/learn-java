package basics.leetcode;

public class Test10 {
    public static void main(String[] args) {
        int[] a={10,2,3,3};
        boolean flag = false;
        int n=a.length;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(i!=j) {
                    if(a[j] == 2*a[i]) {
                        flag = true;
                        break;
                    }
                }
            }
        }
        System.out.println(flag);
    }
}
