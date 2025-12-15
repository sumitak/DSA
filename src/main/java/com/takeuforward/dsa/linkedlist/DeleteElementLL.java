package com.takeuforward.dsa.linkedlist;

public class DeleteElementLL {
    static void main() {
        int[] intArray = {2, 3, 6, 8};
        Node head = ILinkedList.convertArrayToLinkedList(intArray);
        assert head != null;
        Node newHead = moveHead(head);
        System.out.println(newHead.data);
    }

    private static Node moveHead(Node head){
        Node temp = head.next;
        head = temp;
        temp.next = null;
        return head;
    }

}
