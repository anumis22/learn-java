package practice;

import java.math.BigInteger;
import java.util.Scanner;

public class AddAndMultiply {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger bg1 = new BigInteger(in.nextLine());
        BigInteger bg2 = new BigInteger(in.nextLine());
        System.out.println(bg1.add(bg2));
        System.out.println(bg1.multiply(bg2));
    }
}
