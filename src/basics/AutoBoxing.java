package basics;

public class AutoBoxing {
    public static void main(String[] args) {
        int x= 1_000_000_000;
        int y = Integer.valueOf(x);
        System.out.println(y);
    }
}
