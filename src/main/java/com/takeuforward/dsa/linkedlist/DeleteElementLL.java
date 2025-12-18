package com.takeuforward.dsa.linkedlist;

public class DeleteElementLL {
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
        //removing elements
        newHead = removeElement(newHead, 6);
        ILinkedList.printLinkedList("new LinkedList after removing an element 6",newHead);
        newHead = removeElement(newHead, 7);
        ILinkedList.printLinkedList("new LinkedList after removing an element 7",newHead);
        newHead = removeElement(newHead, 10);
        ILinkedList.printLinkedList("new LinkedList after removing an element 10",newHead);
        newHead = removeElement(newHead, 3);
        ILinkedList.printLinkedList("new LinkedList after removing an element 3",newHead);
        newHead = removeElement(newHead, 8);
        ILinkedList.printLinkedList("new LinkedList after removing an element 8",newHead);
        newHead = removeElement(newHead, 6);
        ILinkedList.printLinkedList("new LinkedList after removing an element 6",newHead);
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

    private static Node removeElement(Node head, int element){
       if(head == null) {
          // System.out.println("LinkedList is empty");
           return head;
       }
        Node temp = head;
        if(temp.data == element){
            return removeHead(head);
        }
        while(temp.next != null && temp.next.data != element){
            temp = temp.next;
        }
        if(temp.next != null){
            temp.next = temp.next.next;
        }
        return head;
    }

}
