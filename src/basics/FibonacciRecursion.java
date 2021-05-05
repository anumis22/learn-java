package basics;

public class FibonacciRecursion {
    int fibonacci(int n) {
        int res;
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        res = fibonacci(n-1) + fibonacci(n-2);
        return res;
    }

    public static void main(String[] args) {
        FibonacciRecursion f = new FibonacciRecursion();
        System.out.println(" for 3: "+f.fibonacci(3));
    }
}
