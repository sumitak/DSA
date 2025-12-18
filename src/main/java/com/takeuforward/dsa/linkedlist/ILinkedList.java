package com.takeuforward.dsa.linkedlist;

public interface ILinkedList {

    static Node convertArrayToLinkedList(int[] arr) {
        if (arr.length == 0) {
            return null;
        }

        Node head = new Node(arr[0]);
        Node current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }

        return head;
    }

    static void printLinkedList(Node head) {
        if(head == null){
            System.out.println("LinkedList is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    static void printLinkedList(String msg, Node head) {
        if(head == null){
            System.out.println("LinkedList is empty");
            return;
        }
        Node current = head;
        System.out.println(msg);
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
