package com.takeuforward.dsa.linkedlist;

public class DeleteElement {
    static void main() {
        int[] intArray = {2, 3, 6, 8, 10,34};
        Node head = ILinkedList.convertArrayToLinkedList(intArray);
        ILinkedList.printLinkedList(head);
        assert head != null;
        Node newHead = removeHead(head);
        //removing head
        ILinkedList.printLinkedList("new LinkedList after removing head node" ,newHead);
        ILinkedList.printLinkedList("new LinkedList after removing head node" ,newHead);

        //removing tail
        ILinkedList.printLinkedList("new LinkedList after removing tail node",removeTail(newHead));
        ILinkedList.printLinkedList("new LinkedList after removing tail node",removeTail(null));

    }

    private static Node removeHead(Node head){
        if(head == null) {
            return null;
        }
        Node temp = head.next;
        head = temp;
      //  temp.next = null;
        return head;
    }

    private static Node removeTail(Node head){
        if(head == null || head.next == null) {
            return null;
        }
        Node temp = head;
       while(temp.next.next != null){
           temp = temp.next;
       }
       temp.next =  null;
         return head;
    }

}
