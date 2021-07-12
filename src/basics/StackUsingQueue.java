package basics;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    void push(int x) {
        q2.add(x);
        while(!q1.isEmpty()) {
            q2.add(q1.poll());
        }
        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
    }

    void pop(){
        if (q1.isEmpty())
            return;
        q1.poll();
    }

    static int top()
    {
        if (q1.isEmpty())
            return -1;
        return q1.peek();
    }
    
    public static void main(String[] args) {
        StackUsingQueue s = new StackUsingQueue();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
    }
}
