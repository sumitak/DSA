package com.takeuforward.dsa.linkedlist;

public class InsertElement {

    static void main() {
        int[] intArray = {2, 3, 6, 8, 10, 34};
        Node head = ILinkedList.convertArrayToLinkedList(intArray);
        ILinkedList.printLinkedList(head);
        assert head != null;
    }
}
