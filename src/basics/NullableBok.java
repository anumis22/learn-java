package basics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NullableBok {
     /*String x = "a";
     void a1(){
        try{
            x +="b";
            B();
        } catch (Exception e ){
            x +="c";
        }
    }

    void B() throws Exception {
        try{
            x +="d";
            C();
        } catch (Exception e ){
            throw new Exception();
        }finally {
            x +="e";
        }
        x +="f";
    }

    void C() throws Exception {

            throw new Exception();

    }

    void display () {
        System.out.println(x);
    }*/
    public static void main(String[] args) {
        /* NullableBok n = new NullableBok();
             n.a1();;
             n.display();*/
        Map<String, Integer> map = new HashMap<>();
        String a = "abc";
        String b = new String("abc");
        map.put(a,10);
        map.put(b,20);
        map.put(new String("abc"),30);
        System.out.println(map.get("abc"));

    }
}
