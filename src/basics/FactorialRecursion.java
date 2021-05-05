package basics;

class Factorial {
    int fact(int n) {
        int res;
        if(n==1)
            return 1;
        res = fact(n-1) * n;
        return res;
    }
}
public class FactorialRecursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println(" for 3: "+f.fact(3));
    }
}
