import basics.TestStaticSequence;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Check {
    static{
        System.out.println("Hello");
    }
    public static final int p = 1;
    public static int c = 1;
}
class NestedTry extends TestStaticSequence {

    String a ;
    public NestedTry(String x) {
        this.a = x;
        System.out.println("child");
        System.out.println(a);
    }

    public static  void main(String[] args){
        String a = "anu";
        String b = "anu";
        String c = new String("anu");
        System.out.println(a==c);
    }
}
