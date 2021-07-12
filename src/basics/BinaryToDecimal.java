package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryToDecimal {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,0,1,1);
        int binary=1010;
        int decimal = 0;
        int n = 0;
        while(true){
            if(binary == 0){
                break;
            } else {
                int temp = binary%10;
                decimal += temp*Math.pow(2, n);
                binary = binary/10;
                n++;
            }
        }

    }
}
