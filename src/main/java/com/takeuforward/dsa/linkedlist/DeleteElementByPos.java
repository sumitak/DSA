package com.takeuforward.dsa.linkedlist;

public class DeleteElementByPos {
    static void main() {
        int[] intArray = {2, 3, 6};
        Node head = ILinkedList.convertArrayToLinkedList(intArray);
        ILinkedList.printLinkedList(head);
        assert head != null;
        Node newHead = removeElementByPos(head, 4);
        ILinkedList.printLinkedList("new LinkedList after removing head node" ,newHead);

    }
    /**
     * overall time complexity: O(n)
     * best case time complexity: O(1)  (when pos = 1)
     * worst case time complexity: O(n) (when pos = length of linkedlist)
     * average case time complexity: O(n/2)
     * space complexity: O(1)
     * how is the space complexity O(1) ?
     * because we are using only a constant amount of extra space (a few variables) regardless of the input size.
     *
     */
    private static Node removeElementByPos(Node head, int pos){
        if(head == null) {
            return null;
        }
        if(pos <= 0){
            return head;
        }
        Node temp = head;
        if(pos == 1){
            return head.next;
        }

        for(int count = 1; count < pos-1; count++) {
            temp = temp.next;
        }

        if(temp == null || temp.next == null){
            return head;
        }
        temp.next = temp.next.next;
        return head;
    }
}
