package hackerrank.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TestResult {

        /*
         * Complete the 'countingValleys' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. INTEGER steps
         *  2. STRING path
         */

        public static int countingValleys(int steps, String path) {
            int res = 0;
            int v= 0;
            for(int i=0;i<steps;i++) {
                if(path.charAt(i) == 'U')
                    ++res;
                else
                    --res;

                if(res == 0 && path.charAt(i) == 'U')
                    ++v;
            }
            System.out.print(v);
            return v;
        }

    }

    public class Test1 {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int steps = Integer.parseInt(bufferedReader.readLine().trim());
            String path = bufferedReader.readLine();
            int result = TestResult.countingValleys(steps, path);
            System.out.println(result);
            bufferedReader.close();
        }
}
