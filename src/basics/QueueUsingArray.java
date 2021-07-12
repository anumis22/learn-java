package basics;

public class QueueUsingArray {
    private static int front,rear,capacity;
    private static int[] queue;

    QueueUsingArray(int c){
        front=rear=0;
        capacity=c;
        queue = new int[c];
    }

    static void enqueue(int data) {
        if(rear==capacity)
            System.out.println("overflow");
        else {
            queue[rear]=data;
            rear++;
        }
    }

    static void dequeue() {
        if(front==rear)
            System.out.println("Underflow");
        else {
            for(int i =0;i<rear-1;i++){
                queue[i]=queue[i+1];
//                rear--;
                front++;
            }
        }
    }

    static void queueDisplay()
    {
        int i;
        if (front == rear) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }

        // traverse front to rear and print elements
        for (i = front; i < rear; i++) {
            System.out.printf(" %d <-- ", queue[i]);
        }
        return;
    }

    public static void main(String[] args) {
        QueueUsingArray q = new QueueUsingArray(4);

        // print Queue elements
        q.queueDisplay();

        // inserting elements in the queue
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        // print Queue elements
        q.queueDisplay();

        // insert element in the queue
        q.enqueue(60);

        // print Queue elements
        q.queueDisplay();

        q.dequeue();
        q.dequeue();
        System.out.printf("\n\nafter two node deletion\n\n");

        // print Queue elements
        q.queueDisplay();
    }
}
