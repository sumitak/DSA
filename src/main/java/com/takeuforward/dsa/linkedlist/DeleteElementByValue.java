package com.takeuforward.dsa.linkedlist;

public class DeleteElementByValue {
    static void main() {
        int[] intArray = {2, 3, 6, 8, 10,34};
        Node head = ILinkedList.convertArrayToLinkedList(intArray);
        ILinkedList.printLinkedList(head);
        assert head != null;
        Node newHeadV1 = removeElementByValueV1(head, 6);
        Node newHeadV2 = removeElementByValueV1(head, 6);
        ILinkedList.printLinkedList("new LinkedList after removing head node" ,newHeadV1);
        ILinkedList.printLinkedList("new LinkedList after removing head node" ,newHeadV2);
        //removing elements
        newHeadV1 = removeElementByValueV1(newHeadV1, 6);
        newHeadV2 = removeElementByValueV2(newHeadV2, 6);
        ILinkedList.printLinkedList("new LinkedList after removing head node" ,newHeadV1);
        ILinkedList.printLinkedList("new LinkedList after removing head node" ,newHeadV2);
        newHeadV1 = removeElementByValueV1(newHeadV1, 7);
        newHeadV2 = removeElementByValueV2(newHeadV2, 7);
        ILinkedList.printLinkedList("new LinkedList after removing head node" ,newHeadV1);
        ILinkedList.printLinkedList("new LinkedList after removing head node" ,newHeadV2);
        newHeadV1 = removeElementByValueV1(newHeadV1, 10);
        newHeadV2 = removeElementByValueV2(newHeadV2, 10);
        ILinkedList.printLinkedList("new LinkedList after removing head node" ,newHeadV1);
        ILinkedList.printLinkedList("new LinkedList after removing head node" ,newHeadV2);
        newHeadV1 = removeElementByValueV1(newHeadV1, 3);
        newHeadV2 = removeElementByValueV2(newHeadV2, 3);
        ILinkedList.printLinkedList("new LinkedList after removing head node" ,newHeadV1);
        ILinkedList.printLinkedList("new LinkedList after removing head node" ,newHeadV2);
        newHeadV1 = removeElementByValueV1(newHeadV1, 8);
        newHeadV2 = removeElementByValueV2(newHeadV2, 8);
        ILinkedList.printLinkedList("new LinkedList after removing head node" ,newHeadV1);
        ILinkedList.printLinkedList("new LinkedList after removing head node" ,newHeadV2);
        newHeadV1 = removeElementByValueV1(newHeadV2, 6);
        newHeadV2 = removeElementByValueV2(newHeadV2, 6);
        ILinkedList.printLinkedList("new LinkedList after removing head node" ,newHeadV1);
        ILinkedList.printLinkedList("new LinkedList after removing head node" ,newHeadV2);

    }
   /**
    * Complexity Analysis
    * overall time complexity: O(n)
    * if element is found at start then best case time complexity: O(1)
    * if element is found at end or not found then worst case time complexity: O(n)
    * if element is found at middle then average case time complexity: O(n/2)
    * space complexity: O(1)
    * how is the space complexity O(1) ?
    * because we are using only a constant amount of extra space (a few variables) regardless of the input size.
    * **/
    private static Node removeElementByValueV1(Node head, int value){
        if(head == null) {
            return null;
        }
        if(head.data == value){
            return head.next;
        }

        Node curr = head;
        Node prev = null;

        while(curr != null )
        {
            if(curr.data == value){
                prev.next = curr.next;
            }
            prev = curr;
            curr = curr.next;

        }
        return head;
    }

    private static Node removeElementByValueV2(Node head, int element){
        if(head == null) {
            // System.out.println("LinkedList is empty");
            return head;
        }
        Node temp = head;
        if(temp.data == element){
            return head.next;
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
