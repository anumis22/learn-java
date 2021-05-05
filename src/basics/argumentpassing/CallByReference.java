package basics.argumentpassing;

class Test1 {
    int a,b;

    Test1(int i,int j) {
        a=i;
        b=j;
    }
    void meth(Test1 o){
        o.a *= 2;
        o.b /= 2;
        System.out.println("In meth : "+o.a+"  "+o.b);
    }
}
public class CallByReference {
    public static void main(String[] args) {
        Test1 ob = new Test1(15,20);
        System.out.println("Before call :"+ob.a+ "  and "+ob.b);
        ob.meth(ob);
        System.out.println("After call :"+ob.a+ "  and "+ob.b);
    }
}
