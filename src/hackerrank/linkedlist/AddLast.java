package hackerrank.linkedlist;

import practice.linkedlist.LinkedList;

import java.util.Scanner;

public class AddLast {
    private static final Scanner scanner = new Scanner(System.in);

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep) {
        while (node != null) {
            System.out.println(node.data);

            node = node.next;
        }
    }

    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode ll, int data) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        if(ll == null) {
            ll = node;
        } else {
            ll.next = insertNodeAtTail(ll.next, data);
        }
        return ll;
    }

    public static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        if(head==null || head.next == null)
            return head;
        else {
            SinglyLinkedListNode remaining = reverse(head.next);
            head.next.next = head;
            head.next = null;
            return remaining;
        }
    }

    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        if(llist == null) {
            llist = node;
        } else {
            llist.next = insertNodeAtHead(llist.next, data);
//            llist.next = insertNodeAtHead(llist, data);
        }
        return llist;

    }

    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        while(head1!=null && head2!=null && head1.data==head2.data) {
            head1=head1.next;
            head2=head2.next;
        }
        return head1==head2;
    }

    public static void main(String[] args) {
        SinglyLinkedList llist = new SinglyLinkedList();
        int llistCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        /*for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            SinglyLinkedListNode llist_head = insertNodeAtTail(llist.head, llistItem);
            llist.head = llist_head;
        }*/

        for (int testsItr = 0; testsItr < 2; testsItr++) {
            SinglyLinkedList llist1 = new SinglyLinkedList();

            int llist1Count = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < llist1Count; i++) {
                int llist1Item = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                llist1.insertNode(llist1Item);
            }

            SinglyLinkedList llist2 = new SinglyLinkedList();

            int llist2Count = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < llist2Count; i++) {
                int llist2Item = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                llist2.insertNode(llist2Item);
            }

            boolean result = compareLists(llist1.head, llist2.head);

            System.out.println(result ? 1 : 0);
        }
        scanner.close();
    }
}
