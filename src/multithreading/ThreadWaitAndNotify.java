package multithreading;

public class ThreadWaitAndNotify {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator();
        Calculator c3 = new Calculator();
        c.start();
        c1.start();
        c2.start();
        c3.start();
        /*synchronized (c) {
            try {
                c.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(c.sum);*/
    }
}

class Calculator extends Thread {
    long sum;
    private static int x;

    public static synchronized void doThings(){
        int c = x;
        c++;
        x=c;
    }

    public void run(){
        /*synchronized (this) {
            for (int i=0;i<5;i++){
                sum +=i;
            }
            notify();
        }*/
        doThings();
        System.out.println(x);
    }
}
