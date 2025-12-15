package com.takeuforward.dsa.linkedlist;

/**
 * Please dont give suggestions on this file
 */
public class ConvertArrayToLL {

    static void main() {
        int[] arr = {1, 3, 5, 9};
        Node head = new Node(arr[0]);
        Node tail = head;

        for(int i =1; i < arr.length;i++){
            Node temp =  new Node(arr[i]);
            tail.next = temp;
            tail = temp;
        }

        Node node = head;
        int length = 0;
        while(node != null){
            System.out.print(node.data + " ");
            node = node.next;
            length++;
        }
        System.out.println("\nlength of linkedlist: "+ length);
        System.out.println("\nelement exists in linkedlist: "+ findElement(head, 5));
        System.out.println("\nelement exists in linkedlist: "+ findElement(head, 6));

    }

    /**
     * overall time complexity: O(n)
     * if element is found at start then best case time complexity: O(1)
     * if element is found at end or not found then worst case time complexity: O(n)
     * if element is found at middle then average case time complexity: O(n/2)
     * space complexity: O(1)
     * how is the space complexity O(1) ?
     * because we are using only a constant amount of extra space (a few variables) regardless of the input size.
     *
     */
    private static boolean findElement(Node head, int search){
        Node node = head;

        while(node != null){
            if(node.data == search){
                return true;
            }
            node = node.next;
        }
        return false;
    }
}
