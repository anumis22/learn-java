package practice;

public class StringBufferTest {
    public static void main(String[] args) {
        int N = 999999999;
        long t;
        {
            StringBuffer sb = new StringBuffer();
            t = System.currentTimeMillis();
            for(int i=0; i<N; i++) {
                sb.append("");
            }
            System.out.println("buffer: " +(System.currentTimeMillis() - t));
        }

        {
            StringBuilder sb = new StringBuilder();
            t = System.currentTimeMillis();
            for(int i=0; i<N; i++) {
                sb.append("");
            }
            System.out.println("builder: " +(System.currentTimeMillis() - t));
        }
    }
}
