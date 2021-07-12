package basics;

public class StackUsingLL {
    public static void main(String[] args) {
        StackUsingLL obj = new StackUsingLL();
        // insert Stack value
        obj.push(11);
        obj.push(22);
        obj.push(33);
        obj.push(44);

        // print Stack elements
        obj.display();

        // Delete top element of Stack
        obj.pop();
        obj.pop();

        // print Stack elements
        obj.display();
    }
    private static class Node {
        int data;
        Node next;
    }
    Node top;

    StackUsingLL() {
        this.top = null;
    }
    void push(int data) {
        Node temp = new Node();
        if(temp == null) {
            System.out.println("Overflow");
            return;
        }
        temp.data = data;
        temp.next = top;
        this.top = temp;
    }

    void pop() {
        if(top==null) {
            System.out.println("Underflow");
            return;
        }
        top = top.next;
    }

    public void display()
    {
        // check for stack underflow
        if (top == null) {
            System.out.printf("\nStack Underflow");
            return;
        }
        else {
            Node temp = top;
            while (temp != null) {

                // print node data
                System.out.printf("%d->", temp.data);

                // assign temp link to temp
                temp = temp.next;
            }
        }
    }

}
