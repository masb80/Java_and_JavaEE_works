package cycleDetection;

import java.io.*;
import java.util.LinkedList;

public class CycleDetection {

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

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter)
            throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

    static boolean hasCycle(SinglyLinkedListNode head) {
        SinglyLinkedListNode p = head;
        SinglyLinkedListNode q = head.next;
        while (q != null && p != null && q.next != null) {
            q = q.next.next;
            p = p.next;            
            if (p == q) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Cycle detections");
        SinglyLinkedList llist = new SinglyLinkedList();
        llist.head = new SinglyLinkedListNode(1);
        SinglyLinkedListNode second = new SinglyLinkedListNode(1);
        SinglyLinkedListNode third = new SinglyLinkedListNode(3);
        SinglyLinkedListNode forth = new SinglyLinkedListNode(1);
        SinglyLinkedListNode fifth = new SinglyLinkedListNode(2);
        SinglyLinkedListNode sixth = new SinglyLinkedListNode(3);

        llist.head.next = second; 
        second.next = third; 
        third.next = forth;
        forth.next = fifth;
        fifth.next = sixth;
        // LinkedList<Integer> list = new LinkedList<Integer>();
        // list.add(1);
        // list.add(1);
        // list.add(3);
        // list.add(1);
        // list.add(2);
        // list.add(3);
        boolean result = hasCycle(llist.head);
        System.out.println(result);
    }
}
