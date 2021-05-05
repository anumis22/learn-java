package basics.argumentpassing;

class Test {
    void meth(int i, int j){
        i *= 2;
        j /= 2;
        System.out.println("In meth : "+i+"  "+j);
    }
}
public class CallByValue {
    public static void main(String[] args) {
        Test ob = new Test();
        int a =15,b=20;
        System.out.println("Before call :"+a+ "  and "+b);
        ob.meth(a,b);
        System.out.println("After call :"+a+ "  and "+b);
    }
}
