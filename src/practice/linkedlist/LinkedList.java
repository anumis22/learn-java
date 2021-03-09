package practice.linkedlist;

import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;

    public void addLast(int item) {
        Node node = new Node(item);
        if(isEmpty()) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
    }

    public void addFirst(int item) {
        Node node = new Node(item);
        if(isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
    }

    public int indexOf(int item) {
        int index =0;
        Node temp = first;
        while (temp != null) {
            if (temp.value == item)
                return index;
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public void print(LinkedList ll) {
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.value + " => ");
            temp = temp.next;
        }
    }

    private boolean isEmpty() {
        return first == null;
    }

    public void removeFirst() {
        if(isEmpty())
            throw new NoSuchElementException();
        Node head = first;
        first = head.next;
        head.next = null;
    }

    public void removeLast() {
        if(isEmpty())
            throw new NoSuchElementException();
        Node current = first;
        while (current != last) {
            if (current.next == last) {
                last = current;
                current.next = null;
                break;
            }
            current = current.next;
        }
    }

    public void removeAt(int index) {
        if(isEmpty())
            throw new NoSuchElementException();

        // Store head node
        Node temp = first;

        // If head needs to be removed
        if (index == 0)
        {
            first = temp.next;   // Change head
            return;
        }

        // Find previous node of the node to be deleted
        for (int i=0; temp!=null && i<index-1; i++)
            temp = temp.next;

        // If position is more than number of nodes
        if (temp == null || temp.next == null)
            return;

        // Node temp->next is the node to be deleted
        // Store pointer to the next of node to be deleted
        Node next = temp.next.next;

        temp.next = next;  // Unlink the deleted node from list
    }

    public int getLength(){
        Node temp = first;
        if (isEmpty())
            return 0;
        int len = 0;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        return len;
    }

    public void reverse() {
        Node temp = first;
        LinkedList ll1 = new LinkedList();
        while (temp != null) {
            ll1.addFirst(temp.value);
            temp = temp.next;
        }
        System.out.println();
        ll1.print(ll1);
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(1);
        ll.addLast(5);
        ll.addLast(6);
        ll.print(ll);
        ll.reverse();
    }
}
