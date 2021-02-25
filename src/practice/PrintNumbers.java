package practice;

import java.io.*;

/*
 * Complete the 'fizzBuzz' function below.
 *
 * The function accepts INTEGER n as parameter.
 */

public class PrintNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.fizzBuzz(n);

        bufferedReader.close();
    }
}

class Result {
    public static void fizzBuzz(int n) {
        int i = 1;
        while (i <= n) {
            if (i%3 == 0 || i%5 == 0) {
                if ((i % 3 == 0 && i % 5 == 0)) {
                    System.out.println("FizzBuzz");
                } else {
                    if ((i % 3 == 0)) {
                        System.out.println("Fizz");
                    } else {
                        System.out.println("Buzz");
                    }
                }
            } else {
                System.out.println(i);
            }
            i++;
        }

    }

}
