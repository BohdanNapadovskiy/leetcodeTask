package org.example;

public class ReverseLinkedList {


    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode nextValue = null;
        return null;

    }


    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


}
